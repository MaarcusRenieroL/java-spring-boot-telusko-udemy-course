package com.maarcus.config;

import com.maarcus.model.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "desktop1")
	
	// Can also do this -> @Bean(name = { "desktop1", "desktop2", ... })
	
	public Desktop desktop() {
		return new Desktop();
	}
}
