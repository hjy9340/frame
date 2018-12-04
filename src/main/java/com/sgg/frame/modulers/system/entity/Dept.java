package com.sgg.frame.modulers.system.entity;

import javax.persistence.*;

@Table(name = "sys_dept")
public class Dept {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 排序
     */
    private Integer num;

    /**
     * 父部门id
     */
    private Integer pid;

    /**
     * 父级ids
     */
    private String pids;

    /**
     * 简称
     */
    private String simplename;

    /**
     * 全称
     */
    private String fullname;

    /**
     * 提示
     */
    private String tips;

    /**
     * 版本（乐观锁保留字段）
     */
    private Integer version;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取排序
     *
     * @return num - 排序
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置排序
     *
     * @param num 排序
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取父部门id
     *
     * @return pid - 父部门id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父部门id
     *
     * @param pid 父部门id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取父级ids
     *
     * @return pids - 父级ids
     */
    public String getPids() {
        return pids;
    }

    /**
     * 设置父级ids
     *
     * @param pids 父级ids
     */
    public void setPids(String pids) {
        this.pids = pids;
    }

    /**
     * 获取简称
     *
     * @return simplename - 简称
     */
    public String getSimplename() {
        return simplename;
    }

    /**
     * 设置简称
     *
     * @param simplename 简称
     */
    public void setSimplename(String simplename) {
        this.simplename = simplename;
    }

    /**
     * 获取全称
     *
     * @return fullname - 全称
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 设置全称
     *
     * @param fullname 全称
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * 获取提示
     *
     * @return tips - 提示
     */
    public String getTips() {
        return tips;
    }

    /**
     * 设置提示
     *
     * @param tips 提示
     */
    public void setTips(String tips) {
        this.tips = tips;
    }

    /**
     * 获取版本（乐观锁保留字段）
     *
     * @return version - 版本（乐观锁保留字段）
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本（乐观锁保留字段）
     *
     * @param version 版本（乐观锁保留字段）
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}