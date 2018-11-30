package com.sgg.frame.service.impl;

import base.test.BaseTest;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sgg.frame.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends BaseTest {


    @Autowired
    private UserService userService;

    @Test
    public void getAllUser() throws Exception {
        PageInfo page = PageHelper.startPage(1, 2).doSelectPageInfo(new ISelect() {
            @Override
            public void doSelect(){
                try {
                    userService.getAllUser();
                }catch (Exception ex){

                }

            }
        });
        Assert.assertTrue(page!=null);
    }

    @Test
    public void getMapList() {
        PageInfo page = PageHelper.startPage(1, 2).doSelectPageInfo(new ISelect() {
            @Override
            public void doSelect(){
                try {
                    userService.getMapList();
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        });
        Assert.assertTrue(page!=null);
    }
}