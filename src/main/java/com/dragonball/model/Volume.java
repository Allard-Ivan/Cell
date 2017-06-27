package com.dragonball.model;

import javax.persistence.*;

public class Volume {
    /**
     * 主键
     */
    @Id
    @Column(name = "vl_id")
    private Integer vlId;

    /**
     * 逻辑卷
     */
    @Column(name = "physical_volume")
    private String physicalVolume;

    /**
     * 物理卷
     */
    @Column(name = "logical_volume")
    private String logicalVolume;

    /**
     * 文件系统
     */
    @Column(name = "file_system")
    private String fileSystem;

    /**
     * 获取主键
     *
     * @return vl_id - 主键
     */
    public Integer getVlId() {
        return vlId;
    }

    /**
     * 设置主键
     *
     * @param vlId 主键
     */
    public void setVlId(Integer vlId) {
        this.vlId = vlId;
    }

    /**
     * 获取逻辑卷
     *
     * @return physical_volume - 逻辑卷
     */
    public String getPhysicalVolume() {
        return physicalVolume;
    }

    /**
     * 设置逻辑卷
     *
     * @param physicalVolume 逻辑卷
     */
    public void setPhysicalVolume(String physicalVolume) {
        this.physicalVolume = physicalVolume == null ? null : physicalVolume.trim();
    }

    /**
     * 获取物理卷
     *
     * @return logical_volume - 物理卷
     */
    public String getLogicalVolume() {
        return logicalVolume;
    }

    /**
     * 设置物理卷
     *
     * @param logicalVolume 物理卷
     */
    public void setLogicalVolume(String logicalVolume) {
        this.logicalVolume = logicalVolume == null ? null : logicalVolume.trim();
    }

    /**
     * 获取文件系统
     *
     * @return file_system - 文件系统
     */
    public String getFileSystem() {
        return fileSystem;
    }

    /**
     * 设置文件系统
     *
     * @param fileSystem 文件系统
     */
    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem == null ? null : fileSystem.trim();
    }
}