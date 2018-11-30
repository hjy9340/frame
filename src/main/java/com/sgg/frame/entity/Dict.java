package com.sgg.frame.entity;

import javax.persistence.*;

@Table(name = "sys_dict")
public class Dict {
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
     * 父级字典
     */
    private Integer pid;

    /**
     * 名称
     */
    private String name;

    /**
     * 提示
     */
    private String tips;

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
     * 获取父级字典
     *
     * @return pid - 父级字典
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父级字典
     *
     * @param pid 父级字典
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
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
}