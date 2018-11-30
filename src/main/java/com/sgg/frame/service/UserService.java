package com.sgg.frame.service;

import com.sgg.frame.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface UserService {


    public List getAllUser() throws Exception;

    SysUser getUserByName(String username);

    List<Map> getMapList() throws Exception;
}
