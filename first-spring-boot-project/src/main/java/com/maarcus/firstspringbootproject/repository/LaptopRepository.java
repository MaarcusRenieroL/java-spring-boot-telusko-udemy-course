package com.maarcus.firstspringbootproject.repository;

import com.maarcus.firstspringbootproject.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
	public void save(Laptop laptop) {
		System.out.println("Saved in database");
	}
}
