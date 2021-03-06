package com.sgg.frame.modulers.system.mapper;

import com.sgg.common.mybatis.mapper.MyMapper;
import com.sgg.frame.modulers.system.entity.LoginLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LoginLogMapper extends MyMapper<LoginLog> {
    /**
     * 获取操作日志
     *
     * @author stylefeng
     * @Date 2017/4/16 23:48
     */
    List<Map<String, Object>> getOperationLogs(@Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("logName") String logName, @Param("logType") String logType, @Param("orderByField") String orderByField, @Param("isAsc") boolean isAsc);

    /**
     * 获取登录日志
     *
     * @author stylefeng
     * @Date 2017/4/16 23:48
     */
    List<Map<String, Object>> getLoginLogs(@Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("logName") String logName, @Param("orderByField") String orderByField, @Param("isAsc") boolean isAsc);

}