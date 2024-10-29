package com.maarcus.job_app_with_react.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "job_posts")
public class JobPost {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int postId;

  private String postProfile;
  private String postDescription;
  private int requiredExperience;
  private List<String> postTechStack;
}
