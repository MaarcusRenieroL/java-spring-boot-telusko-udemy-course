package com.maarcus.spring_jdbc.repository;

import com.maarcus.spring_jdbc.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Getter
@Repository
public class StudentRepository {
  
  // used to execute sql queries
  private JdbcTemplate jdbcTemplate;
  
  @Autowired
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }
	
	public void save(Student s) {
    // update function in JdbcTemplate class is used to execute DML queries
    int rows = jdbcTemplate.update("insert into students (rollno, name, marks) values (?, ?, ?)", s.getRollNo(), s.getName(), s.getMarks());
    System.out.println(rows + " affected");
  }

  public List<Student> findAll() {

    // Whenever we use a select query, it returns a result set.
    // A result set is where the output of the query that you executed retains

    // RowMapper is an interface that helps you get data one by one from the result set
    RowMapper<Student> mapper = new RowMapper<Student>() {

      // mapRow is a function that provides one row from the entire result set and let's the programmer do what he wants to do

      @Override
      public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Student(resultSet.getInt("rollno"), resultSet.getString("name"), resultSet.getInt("marks"));
      }
    };

    return jdbcTemplate.query("select * from students", mapper);
  }

  // other way of writing the above function

  /*
  public List<Student> findAll() {
    return jdbcTemplate.query("select * from students", (resultSet, rowNum) -> {
      return new Student(resultSet.getInt("rollno"), resultSet.getString("name"), resultSet.getInt("marks"));
    });
  }
  */
}
