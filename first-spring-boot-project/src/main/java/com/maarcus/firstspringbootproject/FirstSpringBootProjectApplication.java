package com.maarcus.firstspringbootproject;

import com.maarcus.firstspringbootproject.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootProjectApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		
		// Creating object alien in the original way
//		Alien objAlien = new Alien();
//		objAlien.code();
		
//		// Making spring create the object alien
		Alien contextAlien = context.getBean(Alien.class);
		contextAlien.code();
	}
	
}
