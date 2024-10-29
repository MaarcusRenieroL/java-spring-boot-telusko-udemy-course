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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/jobPosts")
public class JobController {

  @Autowired private JobService jobService;

  @GetMapping
  // @GetMapping(
  //     "jobPosts",
  //     produces = {"application/xml"})
  // If produces is added then it means that the data returns is of that format. If this type is not
  // added in the headers then it will throw a 406 (not accepted) error
  public List<JobPost> getAllJobs() {
    return jobService.findAll();
  }

  @GetMapping("/{id}")
  public JobPost getJobPost(@PathVariable int id) {
    return jobService.findById(id);
  }

  @GetMapping("/keyword/{keyword}")
  public List<JobPost> searchByKeyword(@PathVariable String keyword) {
    return jobService.searchByKeyword(keyword);
  }

  @PostMapping
  // If consumes is added then it means that this post mapping accepts data in xml format only. Else
  // 415 (unsupported media type) error will occur
  // @PostMapping(
  //     "/jobPosts",
  //     consumes = {"application/xml"})
  public JobPost addJob(@RequestBody JobPost jobPost) {
    jobService.save(jobPost);

    return jobService.findById(jobPost.getPostId());
  }

  @PutMapping("/{id}")
  public JobPost updateJob(@PathVariable int id, @RequestBody JobPost jobPost) {
    jobService.updateJob(id, jobPost);

    return jobService.findById(jobPost.getPostId());
  }

  @DeleteMapping("/{id}")
  public void deleteJob(@PathVariable int id) {
    jobService.deleteJob(id);
  }
}
