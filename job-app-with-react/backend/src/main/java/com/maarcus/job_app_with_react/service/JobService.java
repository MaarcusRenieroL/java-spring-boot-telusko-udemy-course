package com.maarcus.job_app_with_react.service;

import com.maarcus.job_app_with_react.model.JobPost;
import com.maarcus.job_app_with_react.repository.JobRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
  @Autowired private JobRepository jobRepository;

  public List<JobPost> findAll() {
    return jobRepository.findAll();
  }

  public List<JobPost> searchByKeyword(String keyword) {
    return jobRepository.findByPostProfileContainingOrPostDescriptionContaining(keyword, keyword);
  }

  public void save(JobPost jobPost) {
    jobRepository.save(jobPost);
  }

  public JobPost findById(int id) {
    return jobRepository.findById(id).orElse(null);
  }

  public void updateJob(int id, JobPost jobPost) {
    Optional<JobPost> optionalJobPost = jobRepository.findById(id);

    if (optionalJobPost.isPresent()) {
      JobPost existingJobPost = optionalJobPost.get();

      existingJobPost.setPostProfile(jobPost.getPostProfile());
      existingJobPost.setPostDescription(jobPost.getPostDescription());
      existingJobPost.setPostTechStack(jobPost.getPostTechStack());
      existingJobPost.setRequiredExperience(jobPost.getRequiredExperience());

      jobRepository.save(existingJobPost);
    }
  }

  public void deleteJob(int id) {
    jobRepository.deleteById(id);
  }
}
