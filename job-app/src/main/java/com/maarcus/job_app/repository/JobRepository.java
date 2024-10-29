package com.maarcus.job_app.repository;

import java.util.ArrayList;
import java.util.List;

import com.maarcus.job_app.model.JobPost;

public class JobRepository {
  List<JobPost> jobPosts = new ArrayList<>();

  public List<JobPost> getAllJobPosts() {
    return jobPosts;
  }

  public void addJob(JobPost jobPost) {
    jobPosts.add(jobPost);
  }
}
