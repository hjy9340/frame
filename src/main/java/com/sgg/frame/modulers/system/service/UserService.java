package com.sgg.frame.modulers.system.service;


import com.sgg.frame.modulers.system.entity.User;

import java.util.List;

public interface UserService {


    public List getAllUser() throws Exception;

    User getUserByName(String username);

    List<User> getMapList() throws Exception;
}
