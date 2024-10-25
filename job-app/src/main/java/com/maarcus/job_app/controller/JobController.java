package com.maarcus.job_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

  @RequestMapping({"/", "home"})
  public String home() {
    return "home";
  }

  @RequestMapping("/add-job")
  public String addJob() {
    return "add-job";
  }
}
