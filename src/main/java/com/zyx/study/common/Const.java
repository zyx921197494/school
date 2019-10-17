package com.zyx.study.common;

/**
 * @author zyx
 * @name: Const
 * @description: TODO
 * @date 2019/10/1711:13
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";
    public static final String NO = "no";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER = 0;    //学生用户
        int ROLE_ADMIN = 1;       //教师
    }

}
