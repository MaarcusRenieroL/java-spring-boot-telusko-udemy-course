package com.maarcus.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
	
	public Desktop() {
		System.out.println("Desktop object created");
	}
	
	public void compile() {
		System.out.println("Compiling with Desktop...");
	}
}
