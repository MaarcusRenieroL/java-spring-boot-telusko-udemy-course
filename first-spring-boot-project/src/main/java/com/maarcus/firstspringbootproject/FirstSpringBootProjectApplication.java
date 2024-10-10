package com.maarcus.firstspringbootproject;

import com.maarcus.firstspringbootproject.model.Alien;
import com.maarcus.firstspringbootproject.model.Laptop;
import com.maarcus.firstspringbootproject.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootProjectApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		
		LaptopService laptopService = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		
		laptopService.addLaptop(laptop);
		
		// Creating object alien in the original way
//		Alien objAlien = new Alien();
//		objAlien.code();
		
//		// Making spring create the object alien
//		Alien contextAlien = context.getBean(Alien.class);
//		contextAlien.code();
	}
	
}
