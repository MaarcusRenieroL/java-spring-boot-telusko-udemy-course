package com.maarcus.spring_boot_web.controller;

import com.maarcus.spring_boot_web.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

  @RequestMapping("/")
  public String hello() {
    return "index";
  }

  // way 1
  // @RequestMapping("/add")
  // public String add(HttpServletRequest request, HttpSession session) {

  //   session.setAttribute("result", Integer.parseInt(request.getParameter("num1")) +
  // Integer.parseInt(request.getParameter("num2")));
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
  // @RequestMapping("/add")
  // public String add(@RequestParam int num1, @RequestParam int num2, Model model) {
  //   model.addAttribute("result", num1 + num2);

  //   return "result";
  // }

  // way 5
  @RequestMapping("/add")
  public ModelAndView add(@RequestParam int num1, @RequestParam int num2, ModelAndView mv) {
    mv.addObject("result", num1 + num2);
    mv.setViewName("result");
    return mv;
  }

  @RequestMapping("/addAlien")
  public ModelAndView addAlien(@RequestParam int id, @RequestParam String name, ModelAndView mv) {
    mv.addObject("alien", new Alien(id, name));
    mv.setViewName("result");
    return mv;
  }

  // using model attribute annotation is optional because it is used behind the scenes
  // @RequestMapping("/addAlien1")
  // public String addAlien(@ModelAttribute Alien alien) {
  //   return "result";
  // }
}

