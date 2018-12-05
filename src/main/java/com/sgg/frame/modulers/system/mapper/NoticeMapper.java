package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.Notice;

import java.util.List;
import java.util.Map;

public interface NoticeMapper extends MyMapper<Notice> {
    List<Map<String, Object>> list(String condition);
}