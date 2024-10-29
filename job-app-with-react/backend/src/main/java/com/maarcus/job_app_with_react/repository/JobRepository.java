package com.maarcus.job_app_with_react.repository;

import com.maarcus.job_app_with_react.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {}
