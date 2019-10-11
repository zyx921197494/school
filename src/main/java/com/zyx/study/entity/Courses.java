package com.zyx.study.entity;

import javax.persistence.Entity;

//@Entity
public class Courses {
    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCousename() {
        return cousename;
    }

    public void setCousename(String cousename) {
        this.cousename = cousename;
    }

    public String getCourseroom() {
        return courseroom;
    }

    public void setCourseroom(String courseroom) {
        this.courseroom = courseroom;
    }

    public String getCourseinstructor() {
        return courseinstructor;
    }

    public void setCourseinstructor(String courseinstructor) {
        this.courseinstructor = courseinstructor;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Courses(Integer courseid, String cousename, String courseroom, String courseinstructor, String starttime, String endtime) {
        this.courseid = courseid;
        this.cousename = cousename;
        this.courseroom = courseroom;
        this.courseinstructor = courseinstructor;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public Courses() {
    }

    @Override
    public String toString() {
        return "courses{" +
                "courseid=" + courseid +
                ", cousename='" + cousename + '\'' +
                ", courseroom='" + courseroom + '\'' +
                ", courseinstructor='" + courseinstructor + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }

    private Integer courseid;
    private String cousename;
    private String courseroom;
    private String courseinstructor;
    private String starttime;
    private String endtime;

}
