package com.zyx.study.controller;

import com.zyx.study.dao.TeacherMapper;
import com.zyx.study.entity.Courses;
import com.zyx.study.entity.Mark;
import com.zyx.study.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherMapper teacherMapper;

    @RequestMapping("tea1")
    public List<Courses> tea1(Integer no) {
        List<Courses> courses = teacherMapper.selectCoursesByNo(no);
        return courses;
    }

    @RequestMapping("tea2")
    public List<Student> tea2(Integer no) {
        List<Student> students = teacherMapper.selectStusByNo(no);
        return students;
    }

    @RequestMapping("/tea3")
    public List<Mark> tea3(Integer no) {
        List<Mark> marks = teacherMapper.selectMarksByNo(no);
        return marks;
    }


}
