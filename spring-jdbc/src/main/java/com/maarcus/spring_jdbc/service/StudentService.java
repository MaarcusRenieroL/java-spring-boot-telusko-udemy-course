package com.maarcus.spring_jdbc.service;

import com.maarcus.spring_jdbc.model.Student;
import com.maarcus.spring_jdbc.repository.StudentRepository;
import java.util.List;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Service
public class StudentService {

  private StudentRepository studentRepository;
	
	@Autowired
  public void setStudentRepository(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public void addStudent(Student s) {
    studentRepository.save(s);
  }

  public List<Student> getStudents() {
    return studentRepository.findAll();
  }
}
