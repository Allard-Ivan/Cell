package com.dragonball.model;

import javax.persistence.*;

public class Network {
    /**
     * 主键
     */
    @Id
    @Column(name = "network_id")
    private Short networkId;

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
     * @return network_id - 主键
     */
    public Short getNetworkId() {
        return networkId;
    }

    /**
     * 设置主键
     *
     * @param networkId 主键
     */
    public void setNetworkId(Short networkId) {
        this.networkId = networkId;
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
        this.name = name == null ? null : name.trim();
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
        this.protocol = protocol == null ? null : protocol.trim();
    }
}