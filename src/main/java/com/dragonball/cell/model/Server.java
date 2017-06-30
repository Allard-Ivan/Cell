package com.dragonball.cell.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Server {
    /**
     * ����
     */
    @Id
    @Column(name = "server_id")
    private Short serverId;

    /**
     * ��������
     */
    private String name;

    /**
     * ���� IP
     */
    @Column(name = "public_ip")
    private String publicIp;

    /**
     * ���˻�
     */
    @Column(name = "could_category")
    private String couldCategory;

    /**
     * ��������
     */
    private String area;

    /**
     * �Ƿ����
     */
    private Boolean active;

    /**
     * ���ÿռ�
     */
    @Column(name = "used_space")
    private BigDecimal usedSpace;

    /**
     * ��ȡ����
     *
     * @return server_id - ����
     */
    public Short getServerId() {
        return serverId;
    }

    /**
     * ��������
     *
     * @param serverId ����
     */
    public void setServerId(Short serverId) {
        this.serverId = serverId;
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
     * ��ȡ���� IP
     *
     * @return public_ip - ���� IP
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * ���ù��� IP
     *
     * @param publicIp ���� IP
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp == null ? null : publicIp.trim();
    }

    /**
     * ��ȡ���˻�
     *
     * @return could_category - ���˻�
     */
    public String getCouldCategory() {
        return couldCategory;
    }

    /**
     * �������˻�
     *
     * @param couldCategory ���˻�
     */
    public void setCouldCategory(String couldCategory) {
        this.couldCategory = couldCategory == null ? null : couldCategory.trim();
    }

    /**
     * ��ȡ��������
     *
     * @return area - ��������
     */
    public String getArea() {
        return area;
    }

    /**
     * ������������
     *
     * @param area ��������
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * ��ȡ�Ƿ����
     *
     * @return active - �Ƿ����
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * �����Ƿ����
     *
     * @param active �Ƿ����
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * ��ȡ���ÿռ�
     *
     * @return used_space - ���ÿռ�
     */
    public BigDecimal getUsedSpace() {
        return usedSpace;
    }

    /**
     * �������ÿռ�
     *
     * @param usedSpace ���ÿռ�
     */
    public void setUsedSpace(BigDecimal usedSpace) {
        this.usedSpace = usedSpace;
    }
}