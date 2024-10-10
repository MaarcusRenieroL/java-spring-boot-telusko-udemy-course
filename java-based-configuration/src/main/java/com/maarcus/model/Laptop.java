package com.maarcus.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	public void compile() {
		System.out.println("Compiling with laptop...");
	}
}
