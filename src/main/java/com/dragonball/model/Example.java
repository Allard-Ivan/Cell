package com.dragonball.model;

import javax.persistence.*;

public class Example {
    /**
     * 主键
     */
    @Id
    @Column(name = "eg_id")
    private Short egId;

    /**
     * 服务编号
     */
    @Column(name = "service_tag")
    private String serviceTag;

    /**
     * 内网
     */
    private String intranet;

    /**
     * 公网IP
     */
    @Column(name = "public_ip")
    private String publicIp;

    /**
     * 状态
     */
    private String state;

    /**
     * 规格
     */
    private String specification;

    /**
     * 获取主键
     *
     * @return eg_id - 主键
     */
    public Short getEgId() {
        return egId;
    }

    /**
     * 设置主键
     *
     * @param egId 主键
     */
    public void setEgId(Short egId) {
        this.egId = egId;
    }

    /**
     * 获取服务编号
     *
     * @return service_tag - 服务编号
     */
    public String getServiceTag() {
        return serviceTag;
    }

    /**
     * 设置服务编号
     *
     * @param serviceTag 服务编号
     */
    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag == null ? null : serviceTag.trim();
    }

    /**
     * 获取内网
     *
     * @return intranet - 内网
     */
    public String getIntranet() {
        return intranet;
    }

    /**
     * 设置内网
     *
     * @param intranet 内网
     */
    public void setIntranet(String intranet) {
        this.intranet = intranet == null ? null : intranet.trim();
    }

    /**
     * 获取公网IP
     *
     * @return public_ip - 公网IP
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * 设置公网IP
     *
     * @param publicIp 公网IP
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp == null ? null : publicIp.trim();
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取规格
     *
     * @return specification - 规格
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 设置规格
     *
     * @param specification 规格
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }
}