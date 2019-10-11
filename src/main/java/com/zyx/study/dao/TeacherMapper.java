package com.zyx.study.dao;

import com.zyx.study.entity.Courses;
import com.zyx.study.entity.Mark;
import com.zyx.study.entity.Student;
import com.zyx.study.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface TeacherMapper {
    int insertTeacher(Teacher teacher);

    //TODO
    //老师查看自己应授课程

    List<Courses> selectCoursesByNo(Integer no);

    //老师查看自己某门课程的选课学生

    List<Student> selectStusByNo(Integer no);

    //老师查看自己所授课程各学生成绩

    List<Mark> selectMarksByNo(Integer no);


}
