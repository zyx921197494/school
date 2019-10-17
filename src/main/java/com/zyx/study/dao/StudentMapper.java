package com.zyx.study.dao;

import com.zyx.study.entity.Courses;
import com.zyx.study.entity.Mark;
import com.zyx.study.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
public interface StudentMapper {

    int insertStudent(Student student);

    int deleteStudentByName(String name);

    int deleteStudentByNo(@Param("no") Integer no);

    int updateStudentInfo(Student student);

    //查看某班级全部学生

    List<Student> selectStudentsByClass(@Param("classno") String classNo);

    List<Student> selectStudentsByGrade(@Param("grade") String  grade);

    Student selectStudentByName(String name);

    Student selectStudentByNo(Integer no);

    //根据学生学号查看所其选课程及对应老师、上课地点

    List<Courses> selectCoursesByStuNo(Integer no);

    //学生查看自己各门课程成绩

    List<Mark> selectMarksByStuNo(Integer no);

    //学生选课

    int selectCourses(Integer no, String coursename);


}
