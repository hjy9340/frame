package com.sgg.frame.shiro.stateless.issue;

import java.util.Map;

public class SggJwtInfo {
    private String clientKey;// 客户标识（可以是用户名、app id等等）
    private String digest;// 消息摘要
    private String timeStamp;// 时间戳
    private Map<String, String[]> parameters;// 访问参数
    private String host;// 客户端IP
    private String roles;//用户角色

}
