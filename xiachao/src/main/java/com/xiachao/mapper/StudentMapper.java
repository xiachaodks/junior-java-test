package com.xiachao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiachao.pojo.Student;

import java.util.List;

public interface StudentMapper extends BaseMapper{

    /**
     * 完成学生和课程的关联保存
     */
    void insert(Student student);

    void insertRelation(Integer stu_id,Integer course_id);

   //查询某个学生的信息以及所关联的课程信息
    List<Student> findAllStuAndCourse();

    List<Student> findAllStudent();

    void insertStudent(Student student);

    Student findStudentById(Integer id);

    void updateStudent(Student student);

    void deleteStudent(String stud_name);

    //姓名：模糊查询
    List<Student> findStudentByName(String stud_name);

    //性别：精确查询
    List<Student> findStudentBySex(Integer sex);

    //年级：精确查询 学生删除时，需要删除与课程的关联信息
    List<Student> findStudentByGrade(Integer grade);

}
