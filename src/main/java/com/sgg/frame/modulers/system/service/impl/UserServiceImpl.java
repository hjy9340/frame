package com.sgg.frame.modulers.system.service.impl;


import com.sgg.frame.modulers.system.entity.User;
import com.sgg.frame.modulers.system.mapper.UserMapper;
import com.sgg.frame.modulers.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List getAllUser() throws Exception {
        return userMapper.selectAll();
    }

    @Override
    public User getUserByName(String username) {
        return null;
    }

    @Override
    public List<User> getMapList() throws Exception{
        return userMapper.selectAll();
    }
}
