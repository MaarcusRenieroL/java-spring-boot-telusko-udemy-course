package com.maarcus.spring_boot_web.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

  public String hello() {
    return "index.jsp";
  }
}