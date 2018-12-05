package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.LoginLog;

import java.util.List;
import java.util.Map;

public interface LoginLogMapper extends MyMapper<LoginLog> {
    List<Map<String, Object>> getOperationLogs(String beginTime, String endTime, String logName, String valueOf, String sort, boolean asc);
}