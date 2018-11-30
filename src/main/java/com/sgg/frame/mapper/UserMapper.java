package com.sgg.frame.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.entity.User;

public interface UserMapper extends MyMapper<User> {
    User getByAccount(String account);
}