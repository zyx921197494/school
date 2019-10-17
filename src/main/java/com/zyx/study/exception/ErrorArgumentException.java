package com.zyx.study.exception;

public class ErrorArgumentException extends RuntimeException{
    public ErrorArgumentException(){
        super("参数错误！");
    }
}
