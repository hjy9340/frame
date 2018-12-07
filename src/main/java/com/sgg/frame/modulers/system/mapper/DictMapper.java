package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DictMapper extends MyMapper<Dict> {
    List<Map<String, Object>> list(@Param("condition") String condition);
    List<Dict> selectByCode(@Param("code") String code);
}