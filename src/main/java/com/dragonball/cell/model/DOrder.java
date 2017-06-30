package com.dragonball.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "d_order")
public class DOrder {
    /**
     * 主键
     */
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单编号
     */
    @Column(name = "order_tag")
    private String orderTag;

    /**
     * 购买账号
     */
    private String username;

    /**
     * 提交时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 是否支付
     */
    private String pay;

    /**
     * 开始时间
     */
    @Column(name = "from_date")
    private Date fromDate;

    /**
     * 到期时间
     */
    @Column(name = "to_date")
    private Date toDate;

    /**
     * 折扣
     */
    private Byte discount;

    /**
     * 订单金额
     */
    private Integer amount;

    /**
     * 备注
     */
    private String comment;

    /**
     * 获取主键
     *
     * @return order_id - 主键
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置主键
     *
     * @param orderId 主键
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号
     *
     * @return order_tag - 订单编号
     */
    public String getOrderTag() {
        return orderTag;
    }

    /**
     * 设置订单编号
     *
     * @param orderTag 订单编号
     */
    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag == null ? null : orderTag.trim();
    }

    /**
     * 获取购买账号
     *
     * @return username - 购买账号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置购买账号
     *
     * @param username 购买账号
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取提交时间
     *
     * @return create_date - 提交时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置提交时间
     *
     * @param createDate 提交时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取是否支付
     *
     * @return pay - 是否支付
     */
    public String getPay() {
        return pay;
    }

    /**
     * 设置是否支付
     *
     * @param pay 是否支付
     */
    public void setPay(String pay) {
        this.pay = pay == null ? null : pay.trim();
    }

    /**
     * 获取开始时间
     *
     * @return from_date - 开始时间
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * 设置开始时间
     *
     * @param fromDate 开始时间
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * 获取到期时间
     *
     * @return to_date - 到期时间
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * 设置到期时间
     *
     * @param toDate 到期时间
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public Byte getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(Byte discount) {
        this.discount = discount;
    }

    /**
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取备注
     *
     * @return comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}