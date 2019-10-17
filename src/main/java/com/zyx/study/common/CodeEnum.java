package com.zyx.study.common;

/**
 * @author zyx
 * @name: CodeEnum
 * @description: TODO
 * @date 2019/10/16 11:05
 */
public enum CodeEnum {
    SUCCESS(101, "成功"),
    NEED_LOGIN(201, "需要登录"),
    ILLEGAL_ARGEMENT(202, "非法的参数"),
    USER_NOTEXIST(203, "用户不存在");


    private final Integer code;
    private final String description;

    CodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }


}
