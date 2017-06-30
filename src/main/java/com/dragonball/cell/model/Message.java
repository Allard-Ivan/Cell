package com.dragonball.cell.model;

import java.util.Date;
import javax.persistence.*;

public class Message {
    /**
     * ����
     */
    @Id
    @Column(name = "msg_id")
    private Integer msgId;

    /**
     * ����ʱ��
     */
    @Column(name = "push_date")
    private Date pushDate;

    /**
     * ������Ϣ
     */
    private String comment;

    /**
     * ��ȡ����
     *
     * @return msg_id - ����
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * ��������
     *
     * @param msgId ����
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return push_date - ����ʱ��
     */
    public Date getPushDate() {
        return pushDate;
    }

    /**
     * ��������ʱ��
     *
     * @param pushDate ����ʱ��
     */
    public void setPushDate(Date pushDate) {
        this.pushDate = pushDate;
    }

    /**
     * ��ȡ������Ϣ
     *
     * @return comment - ������Ϣ
     */
    public String getComment() {
        return comment;
    }

    /**
     * ����������Ϣ
     *
     * @param comment ������Ϣ
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}