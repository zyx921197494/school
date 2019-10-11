package com.zyx.study.entity;

import javax.persistence.Entity;

/**
 * @author zyx
 */

//@Entity
public class Student extends Person {
    public Student() {

    }

    public Student(Integer id, Integer no, String name, String institute, String gender, String phone, String grade, String classes) {
        super(id, no, name, institute, gender, phone);
        this.grade = grade;
        this.classno = classes;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClasses() {
        return classno;
    }

    public void setClasses(String classes) {
        this.classno = classes;
    }

    public Student(String grade, String classNo) {
        this.grade = grade;
        this.classno = classNo;
    }

    private String grade;
    private String classno;
}
