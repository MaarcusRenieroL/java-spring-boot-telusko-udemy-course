package com.maarcus.job_app_with_react.controller;

import com.maarcus.job_app_with_react.model.JobPost;
import com.maarcus.job_app_with_react.service.JobService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class JobController {

  @Autowired private JobService jobService;

  @GetMapping("jobPosts")
  public List<JobPost> getAllJobs() {
    return jobService.findAll();
  }

  @GetMapping("/jobPosts/{id}")
  public JobPost getJobPost(@PathVariable int id) {
    return jobService.findById(id);
  }

  @PostMapping("/jobPosts")
  public JobPost addJob(@RequestBody JobPost jobPost) {
    jobService.save(jobPost);

    return jobService.findById(jobPost.getPostId());
  }

  @PutMapping("/jobPosts/{id}")
  public JobPost updateJob(@PathVariable int id, @RequestBody JobPost jobPost) {
    System.out.println(jobPost.getPostProfile());
    System.out.println(jobPost.getPostDescription());
    System.out.println(jobPost.getRequiredExperience());
    jobService.updateJob(id, jobPost);

    return jobService.findById(jobPost.getPostId());
  }

  @DeleteMapping("/jobPosts/{id}")
  public void deleteJob(@PathVariable int id) {
    jobService.deleteJob(id);
  }
}
