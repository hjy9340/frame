package com.sgg.frame.modulers.system.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "sys_expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 报销金额
     */
    private BigDecimal money;

    /**
     * 描述
     */
    private String desc;

    private Date createtime;

    /**
     * 状态: 1.待提交  2:待审核   3.审核通过 4:驳回
     */
    private Integer state;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 流程定义id
     */
    @Column(name = "processId")
    private String processid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取报销金额
     *
     * @return money - 报销金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置报销金额
     *
     * @param money 报销金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取描述
     *
     * @return desc - 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     *
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取状态: 1.待提交  2:待审核   3.审核通过 4:驳回
     *
     * @return state - 状态: 1.待提交  2:待审核   3.审核通过 4:驳回
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态: 1.待提交  2:待审核   3.审核通过 4:驳回
     *
     * @param state 状态: 1.待提交  2:待审核   3.审核通过 4:驳回
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取流程定义id
     *
     * @return processId - 流程定义id
     */
    public String getProcessid() {
        return processid;
    }

    /**
     * 设置流程定义id
     *
     * @param processid 流程定义id
     */
    public void setProcessid(String processid) {
        this.processid = processid;
    }
}