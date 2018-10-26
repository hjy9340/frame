package com.sgg.frame.dao;

import com.sgg.frame.beans.User;

public interface UserDAO {
    public User getUser(String userName,String password) throws Exception;

    public void insertUser(User user) throws Exception;

    public User findByName(String name);
}
