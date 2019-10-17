package com.zyx.study.controller;

import com.zyx.study.dao.TeacherMapper;
import com.zyx.study.entity.Courses;
import com.zyx.study.entity.Mark;
import com.zyx.study.entity.Student;
import com.zyx.study.exception.ErrorArgumentException;
import com.zyx.study.exception.ResultNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
@Controller
@ResponseBody
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    TeacherMapper teacherMapper;


    /**
     * 教师查询自己应授课程
     *
     * @param no
     * @return
     */

    @RequestMapping("tea1")
    public List<Courses> tea1(@NotNull @Valid Integer no) {
        if (no == null) {
            throw new ErrorArgumentException();
        }
        List<Courses> courses = teacherMapper.selectCoursesByNo(no);
        if (courses.isEmpty()) {
            throw new ResultNotFoundException();
        }
        return courses;
    }


    /**
     * 教师查询自己某门课程的选课学生
     *
     * @param no
     * @return
     */

    @RequestMapping("tea2")
    public List<Student> tea2(@NotNull @Valid Integer no) {
        if (no == null) {
            throw new ErrorArgumentException();
        }
        List<Student> students = teacherMapper.selectStusByNo(no);
        if (students.isEmpty()) {
            throw new ResultNotFoundException();
        }
        return students;
    }


    /**
     * 教师查询自己所授课程各学生成绩
     *
     * @param no
     * @return
     */
    @RequestMapping("/tea3")
    public List<Mark> tea3(@NotNull @Valid Integer no) {
        if (no == null) {
            throw new ErrorArgumentException();
        }
        List<Mark> marks = teacherMapper.selectMarksByNo(no);
        if (marks.isEmpty()) {
            throw new ResultNotFoundException();
        }
        return marks;
    }

}
