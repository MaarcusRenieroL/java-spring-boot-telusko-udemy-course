package com.maarcus.job_app.service;

import com.maarcus.job_app.model.JobPost;
import com.maarcus.job_app.repository.JobRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class JobService {
  @Autowired private JobRepository jobRepository;

  public List<JobPost> findAll() {
    return jobRepository.findAll();
  }

  public void save(JobPost jobPost) {
    jobRepository.save(jobPost);
  }
}
