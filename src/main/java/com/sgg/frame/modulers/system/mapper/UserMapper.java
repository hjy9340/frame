package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.User;

public interface UserMapper extends MyMapper<User> {
    void setRoles(Integer userId, String roleIds);

    void setStatus(Integer userId, int code);
}