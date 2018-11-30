package com.sgg.frame.service.impl;

import com.sgg.frame.entity.SysUser;
import com.sgg.frame.mapper.SysUserMapper;
import com.sgg.frame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public List getAllUser() throws Exception {
        return sysUserMapper.selectAll();
    }

    @Override
    public SysUser getUserByName(String username) {
        return null;
    }

    @Override
    public List<Map> getMapList() throws Exception{
        return sysUserMapper.getMapList("0");
    }
}
