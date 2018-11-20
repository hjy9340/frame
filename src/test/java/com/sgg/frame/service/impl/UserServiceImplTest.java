package com.sgg.frame.service.impl;

import base.test.BaseTest;
import com.sgg.frame.beans.User;
import com.sgg.frame.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

public class UserServiceImplTest extends BaseTest {


    @Autowired
    private UserService userService;
    @Test
    public void getUser() throws Exception {
        User user =userService.findByName("admin");
    }
    @Test
    @Rollback(value = true)
    public void insertUser() throws Exception {
        User user=new User();
        user.setName("wangwu");
        user.setPassword("123456");
        boolean success=userService.insertUser(user);
        Assert.assertTrue(success);
    }
}