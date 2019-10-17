package com.zyx.study.exceptionHandler;

import com.zyx.study.exception.ErrorArgumentException;
import com.zyx.study.exception.ResultNotFoundException;
import com.zyx.study.exception.StudentNotExistException;
import com.zyx.study.exception.TeacherNotExistException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zyx
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(StudentNotExistException.class)
    public String stuHandleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //传入自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("error_code", "student.notExist");
        map.put("error_message", "查找学生时出错,请重新检查！");

        request.setAttribute("extend", map);
        //转发/error
        return "forward:/error";
    }

    @ExceptionHandler(TeacherNotExistException.class)
    public String teaHandleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //传入自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("error_code", "teacher.notExist");
        map.put("error_message", "查找教师时出错，请重新检查！");

        request.setAttribute("extend", map);
        //转发/error
        return "forward:/error";
    }

    @ExceptionHandler(ErrorArgumentException.class)
    public String argHandleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //传入自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("error_code", "error.argument");
        map.put("error_message", "参数输入出错，请重新检查！");

        request.setAttribute("extend", map);
        //转发/error
        return "forward:/error";
    }

    @ExceptionHandler(ResultNotFoundException.class)
    public String resultHandleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //传入自己的错误状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("error_code", "error.argument");
        map.put("error_message", "查询错误，请重新检查！");

        request.setAttribute("extend", map);
        //转发/error
        return "forward:/error";
    }

}
