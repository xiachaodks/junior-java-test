package com.xiachao;

import com.xiachao.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testCourseMapper {

    @Autowired
    private CourseMapper courseMapper;


    //姓名：模糊查询
    @Test
    public void testFindCourseByCourseName(){
        System.out.println(courseMapper.findCourseByCourseName("数"));
    }

}
