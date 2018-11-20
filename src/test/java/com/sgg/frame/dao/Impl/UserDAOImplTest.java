package com.sgg.frame.dao.Impl;

import base.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDAOImplTest extends BaseTest {

    @Autowired
    UserDAOImpl userDAO;
    @Test
    public void getList() throws Exception{
        List list=userDAO.getList();
        Assert.assertTrue(list!=null);
    }
}