package com.zyx.study.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;

//@Entity
public class SelectCourses {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public SelectCourses(Integer id, String studentname, Integer courseid) {
        this.id = id;
        this.studentname = studentname;
        this.courseid = courseid;
    }

    public SelectCourses() {
    }

    private Integer id;
    private String studentname;
    private Integer courseid;

}
