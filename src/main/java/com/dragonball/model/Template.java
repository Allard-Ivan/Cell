package com.dragonball.model;

import java.util.Date;
import javax.persistence.*;

public class Template {
    /**
     * 主键
     */
    @Id
    @Column(name = "template_id")
    private Short templateId;

    /**
     * 服务名称
     */
    private String name;

    /**
     * 年收费标准
     */
    @Column(name = "toll_year")
    private String tollYear;

    /**
     * 月收费标准
     */
    @Column(name = "toll_month")
    private String tollMonth;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 折扣率
     */
    private Byte discount;

    /**
     * 获取主键
     *
     * @return template_id - 主键
     */
    public Short getTemplateId() {
        return templateId;
    }

    /**
     * 设置主键
     *
     * @param templateId 主键
     */
    public void setTemplateId(Short templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取服务名称
     *
     * @return name - 服务名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置服务名称
     *
     * @param name 服务名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取年收费标准
     *
     * @return toll_year - 年收费标准
     */
    public String getTollYear() {
        return tollYear;
    }

    /**
     * 设置年收费标准
     *
     * @param tollYear 年收费标准
     */
    public void setTollYear(String tollYear) {
        this.tollYear = tollYear == null ? null : tollYear.trim();
    }

    /**
     * 获取月收费标准
     *
     * @return toll_month - 月收费标准
     */
    public String getTollMonth() {
        return tollMonth;
    }

    /**
     * 设置月收费标准
     *
     * @param tollMonth 月收费标准
     */
    public void setTollMonth(String tollMonth) {
        this.tollMonth = tollMonth == null ? null : tollMonth.trim();
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取折扣率
     *
     * @return discount - 折扣率
     */
    public Byte getDiscount() {
        return discount;
    }

    /**
     * 设置折扣率
     *
     * @param discount 折扣率
     */
    public void setDiscount(Byte discount) {
        this.discount = discount;
    }
}