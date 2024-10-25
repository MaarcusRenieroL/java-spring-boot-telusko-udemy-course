package com.maarcus.spring_boot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

  @RequestMapping("/")
  public String hello() {
    return "index";
  }

  // way 1
  // @RequestMapping("/add")
  // public String add(HttpServletRequest request, HttpSession session) {

  //   session.setAttribute("result", Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2")));
  //   return "result.jsp";
  // }

  // way 2
  // @RequestMapping("/add")
  // public String add(int num1, int num2, HttpSession session) {
  //   session.setAttribute("result", num1 + num2);
  //   return "result.jsp";
  // }

  // way 3
  // @RequestMapping("/add")
  // public String add(@RequestParam int num1, @RequestParam int num2, HttpSession session) {
  //   session.setAttribute("result", num1 + num2);
  //   return "result.jsp";
  // }

  // way 4
  @RequestMapping("/add")
  public String add(@RequestParam int num1, @RequestParam int num2, Model model) {
    model.addAttribute("result", num1 + num2);

    return "result";
  }

}