package com.zyx.study.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Mark {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarkno() {
        return markno;
    }

    public void setMarkno(Integer markno) {
        this.markno = markno;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", markno=" + markno +
                ", mark='" + mark + '\'' +
                '}';
    }

    public Mark() {
    }

    public Mark(Integer id, Integer markno, String mark) {
        this.id = id;
        this.markno = markno;
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @NotNull
    private Integer id;
    @NotNull
    private Integer markno;
    @NotEmpty
    private String mark;
}
