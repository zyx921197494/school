package com.zyx.study.exception;

public class TeacherNotExistException extends RuntimeException {
    public TeacherNotExistException(){
        super("该教师不存在！");
    }
}
