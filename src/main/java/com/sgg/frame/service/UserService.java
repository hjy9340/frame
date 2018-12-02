package com.sgg.frame.service;


import com.sgg.frame.entity.User;

import java.util.List;

public interface UserService {


    public List getAllUser() throws Exception;

    User getUserByName(String username);

    List<User> getMapList() throws Exception;
}
