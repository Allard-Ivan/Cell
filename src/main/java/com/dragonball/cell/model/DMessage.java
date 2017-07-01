package com.dragonball.cell.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "d_message")
public class DMessage {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
        this.comment = comment;
    }
}