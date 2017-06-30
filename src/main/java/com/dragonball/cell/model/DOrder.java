package com.dragonball.cell.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "d_order")
public class DOrder {
    /**
     * ����
     */
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * �������
     */
    @Column(name = "order_tag")
    private String orderTag;

    /**
     * �����˺�
     */
    private String username;

    /**
     * �ύʱ��
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * �Ƿ�֧��
     */
    private String pay;

    /**
     * ��ʼʱ��
     */
    @Column(name = "from_date")
    private Date fromDate;

    /**
     * ����ʱ��
     */
    @Column(name = "to_date")
    private Date toDate;

    /**
     * �ۿ�
     */
    private Byte discount;

    /**
     * �������
     */
    private Integer amount;

    /**
     * ��ע
     */
    private String comment;

    /**
     * ��ȡ����
     *
     * @return order_id - ����
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * ��������
     *
     * @param orderId ����
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * ��ȡ�������
     *
     * @return order_tag - �������
     */
    public String getOrderTag() {
        return orderTag;
    }

    /**
     * ���ö������
     *
     * @param orderTag �������
     */
    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag == null ? null : orderTag.trim();
    }

    /**
     * ��ȡ�����˺�
     *
     * @return username - �����˺�
     */
    public String getUsername() {
        return username;
    }

    /**
     * ���ù����˺�
     *
     * @param username �����˺�
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * ��ȡ�ύʱ��
     *
     * @return create_date - �ύʱ��
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * �����ύʱ��
     *
     * @param createDate �ύʱ��
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * ��ȡ�Ƿ�֧��
     *
     * @return pay - �Ƿ�֧��
     */
    public String getPay() {
        return pay;
    }

    /**
     * �����Ƿ�֧��
     *
     * @param pay �Ƿ�֧��
     */
    public void setPay(String pay) {
        this.pay = pay == null ? null : pay.trim();
    }

    /**
     * ��ȡ��ʼʱ��
     *
     * @return from_date - ��ʼʱ��
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * ���ÿ�ʼʱ��
     *
     * @param fromDate ��ʼʱ��
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return to_date - ����ʱ��
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * ���õ���ʱ��
     *
     * @param toDate ����ʱ��
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * ��ȡ�ۿ�
     *
     * @return discount - �ۿ�
     */
    public Byte getDiscount() {
        return discount;
    }

    /**
     * �����ۿ�
     *
     * @param discount �ۿ�
     */
    public void setDiscount(Byte discount) {
        this.discount = discount;
    }

    /**
     * ��ȡ�������
     *
     * @return amount - �������
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * ���ö������
     *
     * @param amount �������
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * ��ȡ��ע
     *
     * @return comment - ��ע
     */
    public String getComment() {
        return comment;
    }

    /**
     * ���ñ�ע
     *
     * @param comment ��ע
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}