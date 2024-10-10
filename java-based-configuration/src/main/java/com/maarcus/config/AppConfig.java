package com.maarcus.config;

import com.maarcus.model.Alien;
import com.maarcus.model.Computer;
import com.maarcus.model.Desktop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Alien alien(Computer computer) {
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
}