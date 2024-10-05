package com.maarcus;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Object created");
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
