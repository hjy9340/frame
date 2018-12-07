package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.common.datascope.DataScope;
import com.sgg.frame.modulers.system.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper extends MyMapper<User> {
    void setRoles(Integer userId, String roleIds);

    void setStatus(Integer userId, int code);

    User getByAccount(String account);

    List<Map<String, Object>> selectUsers(DataScope dataScope, String name, String beginTime, String endTime, Integer deptid);
}