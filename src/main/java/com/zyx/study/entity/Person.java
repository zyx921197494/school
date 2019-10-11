package com.zyx.study.entity;

import javax.persistence.Entity;

//@Entity
public class Person {

    public Person() {
    }

    public Person(Integer id, Integer no, String name, String institute, String gender, String phone) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.institute = institute;
        this.gender = gender;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", institute='" + institute + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    protected Integer id;
    protected Integer no;
    protected String name;
    protected String institute;
    protected String gender;
    protected String phone;

}
