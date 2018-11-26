package com.sgg.frame.service;

import com.sgg.frame.beans.User;

import java.util.List;

public interface UserService {
    public User getUser(String username, String password) throws Exception;
    public boolean insertUser(User user) throws Exception;

    public User findByName(String name) throws Exception;
    public com.sgg.frame.entity.User getUser(int id)throws Exception;

    public List getAllUser() throws Exception;
}
