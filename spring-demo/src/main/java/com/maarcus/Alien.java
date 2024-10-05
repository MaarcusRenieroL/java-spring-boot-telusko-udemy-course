package com.maarcus;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Object created");
	}
	
	public Alien(int age) {
		System.out.println("Age constructor called");
		this.age = age;
	}
	
	// use this annotation when you dont want to follow any sequence
	@ConstructorProperties({ "age", "laptop" })
	public Alien(int age, Laptop laptop) {
		System.out.println("Age, Laptop constructor called");
		this.age = age;
		this.laptop = laptop;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		System.out.println("Setter called");
		this.age = age;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	
	public void setLaptop(Laptop laptop) {
		System.out.println("Laptop Setter called");
		this.laptop = laptop;
	}
	
	public void code() {
		laptop.compile();
		System.out.println("Coding");
	}
}
