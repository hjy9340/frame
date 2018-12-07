package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.common.entity.ZTreeNode;
import com.sgg.frame.modulers.system.entity.Dept;

import java.util.List;
import java.util.Map;

public interface DeptMapper extends MyMapper<Dept> {
    List<ZTreeNode> tree();

    List<Map<String, Object>> list(String condition);
}