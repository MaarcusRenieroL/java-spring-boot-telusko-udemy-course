package com.maarcus.firstspringbootproject.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
	public void compile() {
		System.out.println("Compiling with desktop...");
	}
}
