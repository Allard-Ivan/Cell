package com.dragonball.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Server {
    /**
     * 主键
     */
    @Id
    @Column(name = "server_id")
    private Short serverId;

    /**
     * 主机名称
     */
    private String name;

    /**
     * 公网 IP
     */
    @Column(name = "public_ip")
    private String publicIp;

    /**
     * 云账户
     */
    @Column(name = "could_category")
    private String couldCategory;

    /**
     * 所在区域
     */
    private String area;

    /**
     * 是否可用
     */
    private Boolean active;

    /**
     * 已用空间
     */
    @Column(name = "used_space")
    private BigDecimal usedSpace;

    /**
     * 获取主键
     *
     * @return server_id - 主键
     */
    public Short getServerId() {
        return serverId;
    }

    /**
     * 设置主键
     *
     * @param serverId 主键
     */
    public void setServerId(Short serverId) {
        this.serverId = serverId;
    }

    /**
     * 获取主机名称
     *
     * @return name - 主机名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置主机名称
     *
     * @param name 主机名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取公网 IP
     *
     * @return public_ip - 公网 IP
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * 设置公网 IP
     *
     * @param publicIp 公网 IP
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp == null ? null : publicIp.trim();
    }

    /**
     * 获取云账户
     *
     * @return could_category - 云账户
     */
    public String getCouldCategory() {
        return couldCategory;
    }

    /**
     * 设置云账户
     *
     * @param couldCategory 云账户
     */
    public void setCouldCategory(String couldCategory) {
        this.couldCategory = couldCategory == null ? null : couldCategory.trim();
    }

    /**
     * 获取所在区域
     *
     * @return area - 所在区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所在区域
     *
     * @param area 所在区域
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 获取是否可用
     *
     * @return active - 是否可用
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 设置是否可用
     *
     * @param active 是否可用
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 获取已用空间
     *
     * @return used_space - 已用空间
     */
    public BigDecimal getUsedSpace() {
        return usedSpace;
    }

    /**
     * 设置已用空间
     *
     * @param usedSpace 已用空间
     */
    public void setUsedSpace(BigDecimal usedSpace) {
        this.usedSpace = usedSpace;
    }
}