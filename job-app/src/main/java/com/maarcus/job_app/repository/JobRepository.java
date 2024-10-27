package com.maarcus.job_app.repository;

import com.maarcus.job_app.model.JobPost;
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
