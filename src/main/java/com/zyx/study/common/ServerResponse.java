package com.zyx.study.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @author zyx
 * @name: ServerResponse
 * @description: TODO
 * @date 2019/10/17 10:59
 */

public class ServerResponse<T> implements Serializable {

    private Integer status;
    private String message;
    private T data;


    public ServerResponse(Integer status){
        this.status = status;
    }

    public ServerResponse(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public ServerResponse(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
