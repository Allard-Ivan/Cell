package com.dragonball.cell.model;

import javax.persistence.*;

@Table(name = "computer_node")
public class ComputerNode {
    /**
     * ����
     */
    @Id
    @Column(name = "node_id")
    private Short nodeId;

    /**
     * �ڵ�����
     */
    private String name;

    /**
     * ������
     */
    @Column(name = "server_tag")
    private String serverTag;

    /**
     * �ڵ�����
     */
    private String category;

    /**
     * �ڵ�״̬
     */
    private String state;

    /**
     * ��ȡ����
     *
     * @return node_id - ����
     */
    public Short getNodeId() {
        return nodeId;
    }

    /**
     * ��������
     *
     * @param nodeId ����
     */
    public void setNodeId(Short nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * ��ȡ�ڵ�����
     *
     * @return name - �ڵ�����
     */
    public String getName() {
        return name;
    }

    /**
     * ���ýڵ�����
     *
     * @param name �ڵ�����
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ������
     *
     * @return server_tag - ������
     */
    public String getServerTag() {
        return serverTag;
    }

    /**
     * ���÷�����
     *
     * @param serverTag ������
     */
    public void setServerTag(String serverTag) {
        this.serverTag = serverTag == null ? null : serverTag.trim();
    }

    /**
     * ��ȡ�ڵ�����
     *
     * @return category - �ڵ�����
     */
    public String getCategory() {
        return category;
    }

    /**
     * ���ýڵ�����
     *
     * @param category �ڵ�����
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * ��ȡ�ڵ�״̬
     *
     * @return state - �ڵ�״̬
     */
    public String getState() {
        return state;
    }

    /**
     * ���ýڵ�״̬
     *
     * @param state �ڵ�״̬
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}