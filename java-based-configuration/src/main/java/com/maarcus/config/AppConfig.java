package com.maarcus.config;

import com.maarcus.model.Alien;
import com.maarcus.model.Computer;
import com.maarcus.model.Desktop;

import com.maarcus.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	public Alien alien(Computer computer) { // @Qualifier("desktop")
		Alien alien = new Alien();
		alien.setAge(25);
		alien.setComputer(computer);
		return alien;
	}
	
	@Bean
	// @Scope(value = "prototype")
	// Can also do this -> @Bean(name = { "desktop1", "desktop2", ... })
	
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	@Primary
	public Laptop laptop() {
		return new Laptop();
	}
}