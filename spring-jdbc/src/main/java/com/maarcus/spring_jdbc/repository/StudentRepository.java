package com.maarcus.spring_jdbc.repository;

import com.maarcus.spring_jdbc.model.Student;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Getter
@Repository
public class StudentRepository {
  
  private JdbcTemplate jdbcTemplate;
  
  @Autowired
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }
	
	public void save(Student s) {
    int rows = jdbcTemplate.update("insert into student (rollno, name, marks) values (?, ?, ?)", s.getRollNo(), s.getName(), s.getMarks());
    System.out.println(rows + " affected");
  }

  public List<Student> findAll() {
    return new ArrayList<Student>();
  }
}
