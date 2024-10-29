package com.maarcus.ecom_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(EcomAppApplication.class, args);
    System.out.println("Started Ecom App");
  }
}