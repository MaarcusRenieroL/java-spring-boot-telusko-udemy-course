package com.maarcus.firstspringbootproject.service;

import com.maarcus.firstspringbootproject.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	public void addLaptop(Laptop laptop) {
		System.out.println("method called");
	}
	
	public boolean isItGoodForProgramming(Laptop laptop) {
		return true;
	}
}
