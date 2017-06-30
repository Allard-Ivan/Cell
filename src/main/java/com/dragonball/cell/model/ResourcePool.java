package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "resource_pool")
public class ResourcePool {
    /**
     * ����
     */
    @Id
    @Column(name = "pool_id")
    private Short poolId;

    /**
     * ����
     */
    private String name;

    /**
     * ����
     */
    private String category;

    /**
     * �Ƿ�����
     */
    private Boolean apply;

    /**
     * ��ȡ����
     *
     * @return pool_id - ����
     */
    public Short getPoolId() {
        return poolId;
    }

    /**
     * ��������
     *
     * @param poolId ����
     */
    public void setPoolId(Short poolId) {
        this.poolId = poolId;
    }

    /**
     * ��ȡ����
     *
     * @return name - ����
     */
    public String getName() {
        return name;
    }

    /**
     * ��������
     *
     * @param name ����
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ����
     *
     * @return category - ����
     */
    public String getCategory() {
        return category;
    }

    /**
     * ��������
     *
     * @param category ����
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * ��ȡ�Ƿ�����
     *
     * @return apply - �Ƿ�����
     */
    public Boolean getApply() {
        return apply;
    }

    /**
     * �����Ƿ�����
     *
     * @param apply �Ƿ�����
     */
    public void setApply(Boolean apply) {
        this.apply = apply;
    }
}