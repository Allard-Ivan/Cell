package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "d_mirror")
public class DMirror {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
        this.name = name;
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
        this.mirrorSystem = mirrorSystem;
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
        this.isoFile = isoFile;
    }
}