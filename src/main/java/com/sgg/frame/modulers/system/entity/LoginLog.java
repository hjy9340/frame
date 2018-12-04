package com.sgg.frame.modulers.system.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_login_log")
public class LoginLog {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 日志名称
     */
    private String logname;

    /**
     * 管理员id
     */
    private Integer userid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 是否执行成功
     */
    private String succeed;

    /**
     * 登录ip
     */
    private String ip;

    /**
     * 具体消息
     */
    private String message;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取日志名称
     *
     * @return logname - 日志名称
     */
    public String getLogname() {
        return logname;
    }

    /**
     * 设置日志名称
     *
     * @param logname 日志名称
     */
    public void setLogname(String logname) {
        this.logname = logname;
    }

    /**
     * 获取管理员id
     *
     * @return userid - 管理员id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置管理员id
     *
     * @param userid 管理员id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取是否执行成功
     *
     * @return succeed - 是否执行成功
     */
    public String getSucceed() {
        return succeed;
    }

    /**
     * 设置是否执行成功
     *
     * @param succeed 是否执行成功
     */
    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    /**
     * 获取登录ip
     *
     * @return ip - 登录ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置登录ip
     *
     * @param ip 登录ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取具体消息
     *
     * @return message - 具体消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置具体消息
     *
     * @param message 具体消息
     */
    public void setMessage(String message) {
        this.message = message;
    }
}