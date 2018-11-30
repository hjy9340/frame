package com.sgg.frame.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_operation_log")
public class OperationLog {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 日志类型
     */
    private String logtype;

    /**
     * 日志名称
     */
    private String logname;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 类名称
     */
    private String classname;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 是否成功
     */
    private String succeed;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 备注
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
     * 获取日志类型
     *
     * @return logtype - 日志类型
     */
    public String getLogtype() {
        return logtype;
    }

    /**
     * 设置日志类型
     *
     * @param logtype 日志类型
     */
    public void setLogtype(String logtype) {
        this.logtype = logtype;
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
     * 获取用户id
     *
     * @return userid - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取类名称
     *
     * @return classname - 类名称
     */
    public String getClassname() {
        return classname;
    }

    /**
     * 设置类名称
     *
     * @param classname 类名称
     */
    public void setClassname(String classname) {
        this.classname = classname;
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
     * 获取是否成功
     *
     * @return succeed - 是否成功
     */
    public String getSucceed() {
        return succeed;
    }

    /**
     * 设置是否成功
     *
     * @param succeed 是否成功
     */
    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    /**
     * 获取方法名称
     *
     * @return method - 方法名称
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置方法名称
     *
     * @param method 方法名称
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 获取备注
     *
     * @return message - 备注
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置备注
     *
     * @param message 备注
     */
    public void setMessage(String message) {
        this.message = message;
    }
}