package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "d_network")
public class DNetwork {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 网络名称
     */
    private String name;

    /**
     * 网络协议
     */
    private String protocol;

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
     * 获取网络名称
     *
     * @return name - 网络名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置网络名称
     *
     * @param name 网络名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取网络协议
     *
     * @return protocol - 网络协议
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * 设置网络协议
     *
     * @param protocol 网络协议
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}