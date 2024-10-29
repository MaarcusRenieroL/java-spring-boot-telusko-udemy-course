package com.maarcus.job_app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.maarcus.job_app.model.JobPost;
import com.maarcus.job_app.repository.JobRepository;

public class JobService {

  @Autowired private JobRepository jobRepository;

  public void addJob(JobPost jobPost) {
    jobRepository.addJob(jobPost);
  }
}
