package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "d_rc_pool")
public class DRcPool {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
        this.category = category;
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