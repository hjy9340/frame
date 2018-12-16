package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.common.entity.MenuNode;
import com.sgg.frame.common.entity.ZTreeNode;
import com.sgg.frame.modulers.system.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MenuMapper extends MyMapper<Menu> {
    void deleteRelationByMenu(Integer menuId);

    List<Map<String, Object>> selectMenus(@Param("condition")String menuName, @Param("level")String level);

    List<ZTreeNode> menuTreeList();

    List<Integer> getMenuIdsByRoleId(Integer roleId);

    List<ZTreeNode> menuTreeListByMenuIds(List<Integer> menuIds);

    List<String> getResUrlsByRoleId(Integer roleId);

    List<MenuNode> getMenusByRoleIds(List<Integer> roleList);
}