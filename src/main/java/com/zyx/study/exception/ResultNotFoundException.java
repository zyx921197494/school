package com.zyx.study.exception;

import java.io.Serializable;

public class ResultNotFoundException extends RuntimeException {
    public ResultNotFoundException(){
        super("查询结果不存在！");
    }

}
