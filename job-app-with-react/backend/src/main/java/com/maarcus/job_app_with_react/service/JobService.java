package com.maarcus.job_app_with_react.service;

import com.maarcus.job_app_with_react.model.JobPost;
import com.maarcus.job_app_with_react.repository.JobRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
  @Autowired private JobRepository jobRepository;

  public List<JobPost> findAll() {
    return jobRepository.findAll();
  }

  public void save(JobPost jobPost) {
    jobRepository.save(jobPost);
  }

  public JobPost findById(int id) {
    return jobRepository.findById(id);
  }
}
