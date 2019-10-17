package com.zyx.study.controller;

import com.zyx.study.common.ServerResponse;
import com.zyx.study.dao.StudentMapper;
import com.zyx.study.entity.Courses;
import com.zyx.study.entity.Mark;
import com.zyx.study.entity.Student;
import com.zyx.study.exception.ErrorArgumentException;
import com.zyx.study.exception.ResultNotFoundException;
import com.zyx.study.exception.StudentNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;

@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentMapper studentMapper;

    @RequestMapping("/stu1")
    public Student stu1(@NotEmpty @Valid String name) {
        if (name == null || name == "") {
            throw new ErrorArgumentException();
        }
        Student student = studentMapper.selectStudentByName(name);
        if (student == null) {
            throw new StudentNotExistException();
        }
        return student;
    }

    @RequestMapping("/stu2")
    public Student stu2(@NotNull @Valid Integer no) {
        if (no == null) {
            throw new ErrorArgumentException();
        }
        Student student = studentMapper.selectStudentByNo(no);
        if (student == null) {
            throw new StudentNotExistException();
        }
        return student;
    }

    @RequestMapping("/stu3")
    public List<Student> stu3(@NotEmpty @Valid String classNo) {
        if (classNo == null || classNo == "") {
            throw new ErrorArgumentException();
        }
        List<Student> students = studentMapper.selectStudentsByClass(classNo);
        if (students.isEmpty()) {
            throw new StudentNotExistException();
        }
        return students;
    }

    @RequestMapping("/stu4")
    public List<Student> stu4(@NotEmpty @Valid String grade) {
        if (grade == null || grade == "") {
                    throw new ErrorArgumentException();
        }
        List<Student> students = studentMapper.selectStudentsByGrade("2018");
        if (students.isEmpty()) {
            throw new StudentNotExistException();
        }
        return students;
    }

    @RequestMapping("/stu5")
    public List<Courses> stu5(@NotNull @Valid Integer no) {
        if (no == null) {
            throw new ErrorArgumentException();
        }
        List<Courses> courses = studentMapper.selectCoursesByStuNo(no);
        if (courses == null) {
            throw new ResultNotFoundException();
        }
        return courses;
    }

    @RequestMapping("/stu6")
    public List<Mark> stu6(@NotNull @Valid Integer no) {
        if (no == null) {
            throw new ErrorArgumentException();
        }
        List<Mark> marks = studentMapper.selectMarksByStuNo(no);
        if (marks == null) {
            throw new ResultNotFoundException();
        }
        return marks;
    }


}
