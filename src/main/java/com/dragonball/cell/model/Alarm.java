package com.dragonball.cell.model;

import java.util.Date;
import javax.persistence.*;

public class Alarm {
    @Id
    @Column(name = "alarm_id")
    private Integer alarmId;

    @Column(name = "create_date")
    private Date createDate;

    private String comment;

    /**
     * @return alarm_id
     */
    public Integer getAlarmId() {
        return alarmId;
    }

    /**
     * @param alarmId
     */
    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}