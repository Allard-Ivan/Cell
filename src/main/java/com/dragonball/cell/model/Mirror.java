package com.dragonball.cell.model;

import javax.persistence.*;

public class Mirror {
    /**
     * ����
     */
    @Id
    @Column(name = "mirror_id")
    private Short mirrorId;

    /**
     * ��������
     */
    private String name;

    /**
     * ����ϵͳ
     */
    @Column(name = "mirror_system")
    private String mirrorSystem;

    /**
     * ���� iso �ļ�
     */
    @Column(name = "iso_file")
    private String isoFile;

    /**
     * ��ȡ����
     *
     * @return mirror_id - ����
     */
    public Short getMirrorId() {
        return mirrorId;
    }

    /**
     * ��������
     *
     * @param mirrorId ����
     */
    public void setMirrorId(Short mirrorId) {
        this.mirrorId = mirrorId;
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
     * ���þ�������
     *
     * @param name ��������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ����ϵͳ
     *
     * @return mirror_system - ����ϵͳ
     */
    public String getMirrorSystem() {
        return mirrorSystem;
    }

    /**
     * ���þ���ϵͳ
     *
     * @param mirrorSystem ����ϵͳ
     */
    public void setMirrorSystem(String mirrorSystem) {
        this.mirrorSystem = mirrorSystem == null ? null : mirrorSystem.trim();
    }

    /**
     * ��ȡ���� iso �ļ�
     *
     * @return iso_file - ���� iso �ļ�
     */
    public String getIsoFile() {
        return isoFile;
    }

    /**
     * ���þ��� iso �ļ�
     *
     * @param isoFile ���� iso �ļ�
     */
    public void setIsoFile(String isoFile) {
        this.isoFile = isoFile == null ? null : isoFile.trim();
    }
}