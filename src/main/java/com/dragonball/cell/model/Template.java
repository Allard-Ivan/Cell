package com.dragonball.cell.model;

import java.util.Date;
import javax.persistence.*;

public class Template {
    /**
     * ����
     */
    @Id
    @Column(name = "template_id")
    private Short templateId;

    /**
     * ��������
     */
    private String name;

    /**
     * ���շѱ�׼
     */
    @Column(name = "toll_year")
    private String tollYear;

    /**
     * ���շѱ�׼
     */
    @Column(name = "toll_month")
    private String tollMonth;

    /**
     * ��������
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * �ۿ���
     */
    private Byte discount;

    /**
     * ��ȡ����
     *
     * @return template_id - ����
     */
    public Short getTemplateId() {
        return templateId;
    }

    /**
     * ��������
     *
     * @param templateId ����
     */
    public void setTemplateId(Short templateId) {
        this.templateId = templateId;
    }

    /**
     * ��ȡ��������
     *
     * @return name - ��������
     */
    public String getName() {
        return name;
    }

    /**
     * ���÷�������
     *
     * @param name ��������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ���շѱ�׼
     *
     * @return toll_year - ���շѱ�׼
     */
    public String getTollYear() {
        return tollYear;
    }

    /**
     * �������շѱ�׼
     *
     * @param tollYear ���շѱ�׼
     */
    public void setTollYear(String tollYear) {
        this.tollYear = tollYear == null ? null : tollYear.trim();
    }

    /**
     * ��ȡ���շѱ�׼
     *
     * @return toll_month - ���շѱ�׼
     */
    public String getTollMonth() {
        return tollMonth;
    }

    /**
     * �������շѱ�׼
     *
     * @param tollMonth ���շѱ�׼
     */
    public void setTollMonth(String tollMonth) {
        this.tollMonth = tollMonth == null ? null : tollMonth.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return create_date - ��������
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * ���ô�������
     *
     * @param createDate ��������
     */
    public void setCreateDate(Date createDate) {
        this.cr