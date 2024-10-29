package com.maarcus.spring_data_jpa;

import com.maarcus.spring_data_jpa.model.Student;
import com.maarcus.spring_data_jpa.repository.StudentRepository;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
    StudentRepository studentRepository = context.getBean(StudentRepository.class);

    Student student1 = context.getBean(Student.class);
    Student student2 = context.getBean(Student.class);
    Student student3 = context.getBean(Student.class);

    student1.setRollNo(1);
    student1.setName("A");
    student1.setMarks(100);

    student2.setRollNo(2);
    student2.setName("B");
    student2.setMarks(99);

    student3.setRollNo(3);
    student3.setName("C");
    student3.setMarks(98);

    studentRepository.save(student1);
    studentRepository.save(student2);
    studentRepository.save(student3);

    System.out.println(studentRepository.findAll());

    Optional<Student> optionalStudent = studentRepository.findById(4);
    System.out.println(optionalStudent.orElse(new Student()));
  }
}
