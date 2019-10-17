package com.zyx.study.entity;

import javax.persistence.Entity;

/**
 * @author zyx
 */

//@Entity
public class Teacher extends Person {

    private Integer age;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", id=" + id +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", institute='" + institute + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Teacher(Integer id, Integer no, String name, String institute, String gender, String phone, Integer age) {
        super(id, no, name, institute, gender, phone);
        this.age = age;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
}
