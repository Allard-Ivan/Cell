package com.dragonball.cell.model;

import javax.persistence.*;

public class Network {
    /**
     * ����
     */
    @Id
    @Column(name = "network_id")
    private Short networkId;

    /**
     * ��������
     */
    private String name;

    /**
     * ����Э��
     */
    private String protocol;

    /**
     * ��ȡ����
     *
     * @return network_id - ����
     */
    public Short getNetworkId() {
        return networkId;
    }

    /**
     * ��������
     *
     * @param networkId ����
     */
    public void setNetworkId(Short networkId) {
        this.networkId = networkId;
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
     * ������������
     *
     * @param name ��������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ����Э��
     *
     * @return protocol - ����Э��
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * ��������Э��
     *
     * @param protocol ����Э��
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }
}