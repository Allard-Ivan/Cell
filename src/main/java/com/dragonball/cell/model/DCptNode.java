package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "d_cpt_node")
public class DCptNode {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 服务编号
     */
    @Column(name = "server_tag")
    private String serverTag;

    /**
     * 节点类型
     */
    private String category;

    /**
     * 节点状态
     */
    private String state;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Short getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * 获取节点名称
     *
     * @return name - 节点名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置节点名称
     *
     * @param name 节点名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取服务编号
     *
     * @return server_tag - 服务编号
     */
    public String getServerTag() {
        return serverTag;
    }

    /**
     * 设置服务编号
     *
     * @param serverTag 服务编号
     */
    public void setServerTag(String serverTag) {
        this.serverTag = serverTag;
    }

    /**
     * 获取节点类型
     *
     * @return category - 节点类型
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置节点类型
     *
     * @param category 节点类型
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取节点状态
     *
     * @return state - 节点状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置节点状态
     *
     * @param state 节点状态
     */
    public void setState(String state) {
        this.state = state;
    }
}