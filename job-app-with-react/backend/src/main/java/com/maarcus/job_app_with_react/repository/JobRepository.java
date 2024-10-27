package com.maarcus.job_app_with_react.repository;

import com.maarcus.job_app_with_react.model.JobPost;
import java.util.ArrayList;
import java.util.List;

public class JobRepository {
  List<JobPost> jobPosts = new ArrayList<>();

  public List<JobPost> findAll() {
    return jobPosts;
  }

  public void save(JobPost jobPost) {
    jobPosts.add(jobPost);
  }
}
