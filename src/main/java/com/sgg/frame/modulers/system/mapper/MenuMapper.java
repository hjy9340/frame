package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.common.entity.MenuNode;
import com.sgg.frame.modulers.system.entity.Menu;

import java.util.List;

public interface MenuMapper extends MyMapper<Menu> {
    List<String> getResUrlsByRoleId(Integer roleId);

    List<MenuNode> getMenusByRoleIds(List<Integer> roleList);
}