package com.xiachao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private Integer course_id;
    private String course_name;
    private Float credit;

    private List<Student> studentList;
}
