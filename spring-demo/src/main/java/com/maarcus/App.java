package com.maarcus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// Creating an IoC Container which manages the lifecycle and dependencies of components defined in the XML configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// Gets the bean 
		Alien alien = (Alien) context.getBean("alien");
		alien.code();
	}
}
