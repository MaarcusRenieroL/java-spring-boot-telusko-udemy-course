package com.maarcus.spring_jdbc.repository;

import com.maarcus.spring_jdbc.model.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
  public void save(Student s) {
    System.out.println("added");
  }

  public List<Student> findAll() {
    return new ArrayList<Student>();
  }
}
