package com.sgg.frame.shiro.stateless.issue;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;
import com.sgg.frame.modulers.system.entity.User;
import com.sgg.frame.shiro.ShiroKit;
import com.sgg.frame.shiro.ShiroUser;
import com.sgg.frame.shiro.factory.IShiro;
import com.sgg.frame.shiro.factory.ShiroFactroy;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 基于HMAC（ 散列消息认证码）的控制域
 * @author wangjie (http://www.jianshu.com/u/ffa3cba4c604) 
 * @date 2016年6月24日 下午2:55:15
 */
public class HmacRealm extends AuthorizingRealm {

    public Class<?> getAuthenticationTokenClass() {
        return HmacToken.class;//此Realm只支持HmacToken
    }

    /**
     *  认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
                                                          throws AuthenticationException {
        HmacToken hmacToken = (HmacToken)token;
        List<String> keys = Lists.newArrayList();
        for (String key:hmacToken.getParameters().keySet()){
            if (!"digest".equals(key))
                keys.add(key);
        }
        Collections.sort(keys);//对请求参数进行排序参数->自然顺序
        StringBuffer baseString = new StringBuffer();
        for (String key : keys) {
            baseString.append(hmacToken.getParameters().get(key)[0]);
        }
        //认证端生成摘要
        String serverDigest = JwtUtil.hmacDigest(baseString.toString());
        //客户端请求的摘要和服务端生成的摘要不同
        if(!serverDigest.equals(hmacToken.getDigest())){
            throw new AuthenticationException("数字摘要验证失败！！！");
        }
        Long visitTimeStamp = Long.valueOf(hmacToken.getTimeStamp());
        Long nowTimeStamp = System.currentTimeMillis();
        Long jge = nowTimeStamp - visitTimeStamp;
        if (jge > 60000000) {// 一分钟之前的时间戳，这是有效期可以双方约定由参数传过来
            throw new AuthenticationException("数字摘要失效！！！");
        }
        IShiro shiroFactory = ShiroFactroy.me();
        User user = shiroFactory.user(hmacToken.getClientKey());
        ShiroUser shiroUser = shiroFactory.shiroUser(user);
        SimpleAuthenticationInfo info = shiroFactory.info(shiroUser, user, super.getName());
        return info;
    }
    
    /** 
     * 授权 
     */  
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        IShiro shiroFactory = ShiroFactroy.me();
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        List<Integer> roleList = shiroUser.getRoleList();

        Set<String> permissionSet = new HashSet<>();
        Set<String> roleNameSet = new HashSet<>();

        for (Integer roleId : roleList) {
            List<String> permissions = shiroFactory.findPermissionsByRoleId(roleId);
            if (permissions != null) {
                for (String permission : permissions) {
                    if (StrUtil.isNotEmpty(permission)) {
                        permissionSet.add(permission);
                    }
                }
            }
            String roleName = shiroFactory.findRoleNameByRoleId(roleId);
            roleNameSet.add(roleName);
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionSet);
        info.addRoles(roleNameSet);
        return info;


    }
    /**
     * 设置认证加密方式
     */
    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher md5CredentialsMatcher = new HashedCredentialsMatcher();
        md5CredentialsMatcher.setHashAlgorithmName(ShiroKit.hashAlgorithmName);
        md5CredentialsMatcher.setHashIterations(ShiroKit.hashIterations);
        super.setCredentialsMatcher(md5CredentialsMatcher);
    }
}
