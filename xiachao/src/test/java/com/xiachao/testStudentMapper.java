package com.xiachao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiachao.mapper.CourseMapper;
import com.xiachao.mapper.StudentMapper;
import com.xiachao.pojo.Course;
import com.xiachao.pojo.Student;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class  testStudentMapper {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private CourseMapper courseMapper;

    //设置分页参数
    @Before
    public void before(){
        PageHelper.startPage(1,2);
    }

    //完成学生和课程的关联保存
    @Test
    public void testInsertStudentAndCourse(){
        Student student = new Student(6, "xia", 1, 100, null);
        List<Course> courseList = courseMapper.findCourseByCourseName("高等代数");
        studentMapper.insert(student);
        for (Course course : courseList) {
            studentMapper.insertRelation(student.getStu_id(),course.getCourse_id());
        }
    }

    //查询某个学生的信息以及所关联的课程信息
    @Test
    public void testFindAllStuAndCourse(){
        List<Student> list = studentMapper.findAllStuAndCourse();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void testFindAll(){
        List<Student> studentList= studentMapper.findAllStudent();
        PageInfo<Student> pageInfo = new PageInfo<Student>(studentList);
        System.out.println(pageInfo);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void testFindStudentById(){
        System.out.println(studentMapper.findStudentById(2));
    }

    @Test
    public void testInsert(){
        Student student = new Student(1, "xia", 1, 100, null);
        studentMapper.insertStudent(student);
    }

    @Test
    public void testUpdateStudent(){
        Student student = studentMapper.findStudentById(1);
        student.setStud_name("xiaxiaxia");
        studentMapper.updateStudent(student);
    }

    @Test
    public void testDeleteStudent(){
        studentMapper.deleteStudent("xiachao1");
    }

    //姓名：模糊查询
    @Test
    public void testFindStudentByName(){
        System.out.println(studentMapper.findStudentByName("xia"));
    }

    //性别：精确查询
    @Test
    public void testFindStudentBySex(){
        System.out.println(studentMapper.findStudentBySex(1));
    }

   //年级：精确查询 学生删除时，需要删除与课程的关联信息
   @Test
   public void testFindStudentByGrade(){
       System.out.println(studentMapper.findStudentByGrade(10));
   }
}
