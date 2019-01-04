package com.sgg.frame.common.constants.factory;

import base.test.BaseTest;
import com.sgg.frame.shiro.ShiroKit;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ConstantFactoryTest extends BaseTest {

    @Autowired
    IConstantFactory constantFactory;
    @Test
    public void getRoleName() {
        String role= ConstantFactory.me().getRoleName("1");
        String role2= ConstantFactory.me().getRoleName("1");
        System.out.println(role);
    }
    @Test
    public void springUserList()throws Exception{

        Subject currentUser = ShiroKit.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456".toCharArray());

        currentUser.login(token);
    }
}