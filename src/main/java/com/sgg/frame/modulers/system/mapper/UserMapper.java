package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.User;

public interface UserMapper extends MyMapper<User> {
    User getByAccount(String account);
}