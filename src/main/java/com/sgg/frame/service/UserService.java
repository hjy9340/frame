package com.sgg.frame.service;

import com.sgg.frame.beans.User;

public interface UserService {
    public User getUser(String username, String password) throws Exception;
    public boolean insertUser(User user) throws Exception;

    public User findByName(String name) throws Exception;
}
