package com.dragonball.model;

import javax.persistence.Transient;

/**
 * @author Allard
 * Created by dw on 2017/6/26.
 */
public class PageEntity {
    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
