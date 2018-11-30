package com.sgg.frame.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.entity.Menu;

import java.util.List;

public interface MenuMapper extends MyMapper<Menu> {
    List<String> getResUrlsByRoleId(Integer roleId);
}