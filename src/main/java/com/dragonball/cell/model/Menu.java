package com.dragonball.model;

import javax.persistence.*;

public class Menu {
    @Id
    @Column(name = "menu_id")
    private Short menuId;

    private String name;

    private Boolean level;

    /**
     * At least point to itself
     */
    @Column(name = "parent_id")
    private Short parentId;

    /**
     * At least point to itself
     */
    @Column(name = "parent_id_list")
    private String parentIdList;

    private Boolean active;

    /**
     * @return menu_id
     */
    public Short getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Short menuId) {
        this.menuId = menuId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return level
     */
    public Boolean getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Boolean level) {
        this.level = level;
    }

    /**
     * 获取At least point to itself
     *
     * @return parent_id - At least point to itself
     */
    public Short getParentId() {
        return parentId;
    }

    /**
     * 设置At least point to itself
     *
     * @param parentId At least point to itself
     */
    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取At least point to itself
     *
     * @return parent_id_list - At least point to itself
     */
    public String getParentIdList() {
        return parentIdList;
    }

    /**
     * 设置At least point to itself
     *
     * @param parentIdList At least point to itself
     */
    public void setParentIdList(String parentIdList) {
        this.parentIdList = parentIdList == null ? null : parentIdList.trim();
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }
}