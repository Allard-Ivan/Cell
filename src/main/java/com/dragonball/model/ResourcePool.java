package com.dragonball.model;

import javax.persistence.*;

@Table(name = "resource_pool")
public class ResourcePool {
    /**
     * 主键
     */
    @Id
    @Column(name = "pool_id")
    private Short poolId;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private String category;

    /**
     * 是否申请
     */
    private Boolean apply;

    /**
     * 获取主键
     *
     * @return pool_id - 主键
     */
    public Short getPoolId() {
        return poolId;
    }

    /**
     * 设置主键
     *
     * @param poolId 主键
     */
    public void setPoolId(Short poolId) {
        this.poolId = poolId;
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
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取类型
     *
     * @return category - 类型
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置类型
     *
     * @param category 类型
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 获取是否申请
     *
     * @return apply - 是否申请
     */
    public Boolean getApply() {
        return apply;
    }

    /**
     * 设置是否申请
     *
     * @param apply 是否申请
     */
    public void setApply(Boolean apply) {
        this.apply = apply;
    }
}