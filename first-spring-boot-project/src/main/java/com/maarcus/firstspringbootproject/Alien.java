package com.maarcus.firstspringbootproject;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	Laptop laptop;
	
	public void code() {
		laptop.compile();
		System.out.println("Coding");
	}
	
}
