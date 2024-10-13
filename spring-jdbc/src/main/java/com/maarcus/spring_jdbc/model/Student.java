package com.maarcus.spring_jdbc.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope("prototype")
public class Student {
  private int rollNo;
  private String name;
  private int marks;
}
