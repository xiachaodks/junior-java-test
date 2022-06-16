package com.xiachao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiachao.pojo.Course;

import java.util.List;

public interface CourseMapper extends BaseMapper {

    //课程名：模糊查询
    List<Course> findCourseByCourseName(String course_name);

    void insertCourse(Course course);
    List<Course> findAllCourse();
}
