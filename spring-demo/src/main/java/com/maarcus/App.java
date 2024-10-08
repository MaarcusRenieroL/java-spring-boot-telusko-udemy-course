package com.maarcus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// Creating an IoC Container which manages the lifecycle and dependencies of components defined in the XML configuration
		// This is not only creating a container but creates objects for all the beans with classes mentioned in the spring.xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/*
		 Gets the bean
		 Here we are using the object alien by getting it from the getBean function
		*/
		
		Alien alien2 = (Alien) context.getBean("alien2");
		alien2.code();
		
		Alien alien3 = (Alien) context.getBean("alien3");
		alien3.code();
		
	}
}
