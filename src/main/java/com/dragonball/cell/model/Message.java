package com.dragonball.model;

import java.util.Date;
import javax.persistence.*;

public class Message {
    /**
     * 主键
     */
    @Id
    @Column(name = "msg_id")
    private Integer msgId;

    /**
     * 推送时间
     */
    @Column(name = "push_date")
    private Date pushDate;

    /**
     * 推送消息
     */
    private String comment;

    /**
     * 获取主键
     *
     * @return msg_id - 主键
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * 设置主键
     *
     * @param msgId 主键
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * 获取推送时间
     *
     * @return push_date - 推送时间
     */
    public Date getPushDate() {
        return pushDate;
    }

    /**
     * 设置推送时间
     *
     * @param pushDate 推送时间
     */
    public void setPushDate(Date pushDate) {
        this.pushDate = pushDate;
    }

    /**
     * 获取推送消息
     *
     * @return comment - 推送消息
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置推送消息
     *
     * @param comment 推送消息
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}