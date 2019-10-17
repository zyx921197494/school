package com.zyx.study.exception;

public class StudentNotExistException extends RuntimeException{
    public StudentNotExistException(){
        super("该学生不存在！");
    }
}
