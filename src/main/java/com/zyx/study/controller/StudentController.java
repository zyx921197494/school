package com.zyx.study.controller;

import com.zyx.study.dao.StudentMapper;
import com.zyx.study.entity.Courses;
import com.zyx.study.entity.Mark;
import com.zyx.study.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/stu1")
    public Student stu1(String name) {
        Student student = studentMapper.selectStudentByName(name);
        return student;
    }

    @RequestMapping("/stu2")
    public Student stu2(Integer no) {
        Student student = studentMapper.selectStudentByNo(no);
        return student;
    }

    @RequestMapping("/stu3")
    public List<Student> stu3(String classNo) {
        List<Student> students = studentMapper.selectStudentsByClass("13061803");
        return students;
    }

    @RequestMapping("/stu4")
    public List<Student> stu4(String grade) {
        List<Student> students = studentMapper.selectStudentsByGrade("2018");
        return students;
    }

    @RequestMapping("/stu5")
    public List<Courses> stu5(Integer no) {
        List<Courses> courses = studentMapper.selectCoursesByStuNo(no);
        return courses;
    }

    @RequestMapping("/stu6")
    public List<Mark> stu6(Integer no) {
        List<Mark> marks = studentMapper.selectMarksByStuNo(no);
        return marks;
    }

    @RequestMapping("/stu7")
    public int stu7(Integer no, String coursename) {
//        List<String> coursesList = new LinkedList<String>();
//        Map<String, Object> map = new HashMap<String, Object>();

//        coursesList.add(coursename);
//        map.put("no", no);
//        map.put("coursesList", coursename);
        int result = studentMapper.selectCourses(no, coursename);
        return result;
    }

}
