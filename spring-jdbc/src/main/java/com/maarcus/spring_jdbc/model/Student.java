package com.maarcus.spring_jdbc.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Student {
  private int rollNo;
  private String name;
  private int marks;
}
