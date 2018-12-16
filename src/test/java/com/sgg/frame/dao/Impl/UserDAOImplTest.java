package com.sgg.frame.dao.Impl;

import base.test.BaseTest;
import cn.hutool.core.lang.Console;
import com.github.pagehelper.PageHelper;
import com.sgg.common.web.page.PageInfoBT;
import com.sgg.common.web.page.PageReq;
import com.sgg.frame.modulers.system.mapper.UserMapper;
import com.sgg.frame.modulers.system.warpper.UserWarpper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDAOImplTest extends BaseTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void testGetPagerWarperUser(){

        PageReq pageReq = new PageReq(2, 1, "desc", "id");
        PageHelper.startPage(pageReq.getOffset(), pageReq.getLimit(),pageReq.getOrder());
        List list=userMapper.selectUsers(null,null,null,null,null);
        UserWarpper userWarpper=new UserWarpper(list);
        PageInfoBT bt= this.packForBT((List) userWarpper.warp());
        Console.log(bt);
    }
    /**
     * 把service层的分页信息，封装为bootstrap table通用的分页封装
     */
    protected <T> PageInfoBT<T> packForBT(List<T> page) {
        return new PageInfoBT<T>(page);
    }

}