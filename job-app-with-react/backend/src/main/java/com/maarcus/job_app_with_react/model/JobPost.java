package com.maarcus.job_app_with_react.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {
  private int postId;
  private String postProfile;
  private String postDescription;
  private int requiredExperience;
  private List<String> postTechStack;
}
