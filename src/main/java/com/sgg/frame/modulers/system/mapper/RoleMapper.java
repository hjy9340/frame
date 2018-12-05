package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.common.entity.ZTreeNode;
import com.sgg.frame.modulers.system.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper extends MyMapper<Role> {
    void deleteRolesById(Integer roleId);

    List<Map<String, Object>> selectRoles(String roleName);

    List<ZTreeNode> roleTreeList();

    List<ZTreeNode> roleTreeListByRoleId(String[] strArray);
}