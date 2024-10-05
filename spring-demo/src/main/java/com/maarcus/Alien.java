package com.maarcus;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	private Computer computer;
	
	public Alien() {
		System.out.println("Object created");
	}
	
	public Alien(int age) {
		System.out.println("Age constructor called");
		this.age = age;
	}
	
	// use this annotation when you dont want to follow any sequence
	@ConstructorProperties({ "age", "computer" })
	public Alien(int age, Computer laptop) {
		System.out.println("Age, Laptop constructor called");
		this.age = age;
		this.computer = laptop;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		System.out.println("Setter called");
		this.age = age;
	}
	
	public Computer getComputer() {
		return computer;
	}
	
	public void setComputer(Computer computer) {
		System.out.println("Laptop Setter called");
		this.computer = computer;
	}
	
	public void code() {
		computer.compile();
		System.out.println("Coding");
	}
}
