package com.sgg.frame.service.impl;

import com.sgg.frame.beans.User;
import com.sgg.frame.dao.UserDAO;
import com.sgg.frame.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public User getUser(String username, String password) throws Exception {
        return userDAO.getUser(username,password);
    }

    @Override
    public boolean insertUser(User user) throws Exception {
        userDAO.insertUser(user);
        return true;
    }

    @Override
    public User findByName(String name) throws Exception {
       return userDAO.findByName(name);
    }
}
