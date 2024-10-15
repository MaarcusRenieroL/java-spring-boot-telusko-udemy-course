package com.maarcus.spring_jdbc;

import com.maarcus.spring_jdbc.model.Student;
import com.maarcus.spring_jdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

    Student s = context.getBean(Student.class);
    StudentService ss = context.getBean(StudentService.class);

    s.setRollNo(104);
    s.setName("abc");
    s.setMarks(90);

    ss.addStudent(s);
  }
}
