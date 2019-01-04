package com.sgg.rmms.controller;

import com.google.common.collect.Maps;
import com.sgg.frame.shiro.ShiroUser;
import com.sgg.frame.shiro.stateless.issue.JwtUtil;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
public class TokenController {

    @RequestMapping(value="/apply-token",method= RequestMethod.POST)
    public Map<String,Object> applyToken(@RequestParam(name="clientKey") String clientKey) {
        // 签发一个Json Web Token
        // 令牌ID=uuid，用户=clientKey，签发者=clientKey
        // token有效期=1分钟，用户角色=null,用户权限=create,read,update,delete
      ShiroUser user=   (ShiroUser)SecurityUtils.getSubject().getPrincipal();
      String jwt = JwtUtil.issueJwt(
                UUID.randomUUID().toString()
                , clientKey
                ,"token-server"
                ,60000l
                , user.getRoleList()
                , null
                , SignatureAlgorithm.ES256);
        Map<String,Object> respond = Maps.newHashMap();
        respond.put("jwt", jwt);
        respond.put("user",user);
        return respond;
    }

    /**
     * 暴露 通过HmacMD5 加密算法 api
     * @param data
     * @return
     */
    @RequestMapping(value="/digest")
    public String hmacDigest(String data){
        return JwtUtil.hmacDigest(data);
    }
}
