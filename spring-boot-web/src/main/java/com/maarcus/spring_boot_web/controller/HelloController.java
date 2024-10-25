package com.maarcus.spring_boot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

  @RequestMapping("/")
  public String hello() {
    return "index.jsp";
  }

  @RequestMapping("/add")
  public String add(HttpServletRequest request) {

    System.out.println(Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2")));
    return "result.jsp";
  }
}