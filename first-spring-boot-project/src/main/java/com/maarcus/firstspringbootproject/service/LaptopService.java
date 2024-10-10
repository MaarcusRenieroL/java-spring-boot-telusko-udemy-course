package com.maarcus.firstspringbootproject.service;

import com.maarcus.firstspringbootproject.model.Laptop;
import com.maarcus.firstspringbootproject.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;
	
	public void addLaptop(Laptop laptop) {
		laptopRepository.save(laptop);
	}
	
	public boolean isItGoodForProgramming(Laptop laptop) {
		return true;
	}
}
