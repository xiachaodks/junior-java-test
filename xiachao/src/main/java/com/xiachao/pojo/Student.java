package com.xiachao.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer stu_id;
    private String stud_name;
    private Integer sex;
    private Integer grade;

    private List<Course> courseList;
}
