package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.Dict;

import java.util.List;
import java.util.Map;

public interface DictMapper extends MyMapper<Dict> {
    List<Map<String, Object>> list(String condition);
}