package com.sgg.frame.shiro;

import com.google.common.collect.Sets;
import com.sgg.frame.beans.User;
import com.sgg.frame.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserRealm extends AuthorizingRealm {
    private static Logger LOGGER = LoggerFactory.getLogger(AuthenticatingRealm.class);

    @Autowired
    private UserService userService;
    //@Autowired
   // private RoleService roleService;

    /**
     * Shiro登录认证(原理：用户提交 用户名和密码
     *--- shiro 封装令牌
     *---- realm 通过用户名将密码查询返回
     *---- shiro 自动去比较查询出密码和用户输入密码是否一致
     *---- 进行登陆控制 )
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        LOGGER.info("Shiro开始登录认证");
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        try {
            User user = userService.findByName(token.getUsername());
            // 账号不存在
            if (user == null) {
                return null;
            }
            // 认证缓存信息
            return new SimpleAuthenticationInfo(user, user.getPassword().toCharArray(), getName());

        }catch (Exception ex){
            throw new AuthenticationException();
        }
    }

    /**
     * Shiro权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {

        User shiroUser = (User) principals.getPrimaryPrincipal();
        Set<String> urlSet = Sets.newHashSet();
        Set<String> roles = Sets.newHashSet();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //info.setRoles(roleService.findStringRoles(shiroUser));
        //info.setStringPermissions(roleService.findStringPermissions(shiroUser));
        return info;
    }
}