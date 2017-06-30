package com.dragonball.cell.model;

import javax.persistence.*;

public class Volume {
    /**
     * ����
     */
    @Id
    @Column(name = "vl_id")
    private Integer vlId;

    /**
     * �߼���
     */
    @Column(name = "physical_volume")
    private String physicalVolume;

    /**
     * �����
     */
    @Column(name = "logical_volume")
    private String logicalVolume;

    /**
     * �ļ�ϵͳ
     */
    @Column(name = "file_system")
    private String fileSystem;

    /**
     * ��ȡ����
     *
     * @return vl_id - ����
     */
    public Integer getVlId() {
        return vlId;
    }

    /**
     * ��������
     *
     * @param vlId ����
     */
    public void setVlId(Integer vlId) {
        this.vlId = vlId;
    }

    /**
     * ��ȡ�߼���
     *
     * @return physical_volume - �߼���
     */
    public String getPhysicalVolume() {
        return physicalVolume;
    }

    /**
     * �����߼���
     *
     * @param physicalVolume �߼���
     */
    public void setPhysicalVolume(String physicalVolume) {
        this.physicalVolume = physicalVolume == null ? null : physicalVolume.trim();
    }

    /**
     * ��ȡ�����
     *
     * @return logical_volume - �����
     */
    public String getLogicalVolume() {
        return logicalVolume;
    }

    /**
     * ���������
     *
     * @param logicalVolume �����
     */
    public void setLogicalVolume(String logicalVolume) {
        this.logicalVolume = logicalVolume == null ? null : logicalVolume.trim();
    }

    /**
     * ��ȡ�ļ�ϵͳ
     *
     * @return file_system - �ļ�ϵͳ
     */
    public String getFileSystem() {
        return fileSystem;
    }

    /**
     * �����ļ�ϵͳ
     *
     * @param fileSystem �ļ�ϵͳ
     */
    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem == null ? null : fileSystem.trim();
    }
}