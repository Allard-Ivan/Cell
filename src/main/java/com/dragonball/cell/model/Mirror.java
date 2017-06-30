package com.dragonball.model;

import javax.persistence.*;

public class Mirror {
    /**
     * 主键
     */
    @Id
    @Column(name = "mirror_id")
    private Short mirrorId;

    /**
     * 镜像名称
     */
    private String name;

    /**
     * 镜像系统
     */
    @Column(name = "mirror_system")
    private String mirrorSystem;

    /**
     * 镜像 iso 文件
     */
    @Column(name = "iso_file")
    private String isoFile;

    /**
     * 获取主键
     *
     * @return mirror_id - 主键
     */
    public Short getMirrorId() {
        return mirrorId;
    }

    /**
     * 设置主键
     *
     * @param mirrorId 主键
     */
    public void setMirrorId(Short mirrorId) {
        this.mirrorId = mirrorId;
    }

    /**
     * 获取镜像名称
     *
     * @return name - 镜像名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置镜像名称
     *
     * @param name 镜像名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取镜像系统
     *
     * @return mirror_system - 镜像系统
     */
    public String getMirrorSystem() {
        return mirrorSystem;
    }

    /**
     * 设置镜像系统
     *
     * @param mirrorSystem 镜像系统
     */
    public void setMirrorSystem(String mirrorSystem) {
        this.mirrorSystem = mirrorSystem == null ? null : mirrorSystem.trim();
    }

    /**
     * 获取镜像 iso 文件
     *
     * @return iso_file - 镜像 iso 文件
     */
    public String getIsoFile() {
        return isoFile;
    }

    /**
     * 设置镜像 iso 文件
     *
     * @param isoFile 镜像 iso 文件
     */
    public void setIsoFile(String isoFile) {
        this.isoFile = isoFile == null ? null : isoFile.trim();
    }
}