package com.maarcus.job_app.controller;

import com.maarcus.job_app.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

  @GetMapping({"/", "home"})
  public String home() {
    return "home";
  }

  @GetMapping("/add-job")
  public String addJob() {
    return "add-job";
  }

  @PostMapping("/handleForm")
  public String handleForm(JobPost jobPost) {
    return "success";
  }
}
