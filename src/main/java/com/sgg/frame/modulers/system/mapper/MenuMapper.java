package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.Menu;

import java.util.List;
import java.util.Map;

public interface MenuMapper extends MyMapper<Menu> {
    void deleteRelationByMenu(Integer menuId);

    List<Map<String, Object>> selectMenus(String menuName, String level);
}