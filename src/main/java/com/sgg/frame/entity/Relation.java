package com.sgg.frame.entity;

import javax.persistence.*;

@Table(name = "sys_relation")
public class Relation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单id
     */
    private Long menuid;

    /**
     * 角色id
     */
    private Integer roleid;

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
     * 获取菜单id
     *
     * @return menuid - 菜单id
     */
    public Long getMenuid() {
        return menuid;
    }

    /**
     * 设置菜单id
     *
     * @param menuid 菜单id
     */
    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }

    /**
     * 获取角色id
     *
     * @return roleid - 角色id
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id
     *
     * @param roleid 角色id
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}