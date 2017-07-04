package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "d_example")
public class DExample {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
        this.serviceTag = serviceTag;
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
        this.intranet = intranet;
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
        this.publicIp = publicIp;
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
        this.state = state;
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
        this.specification = specification;
    }
}