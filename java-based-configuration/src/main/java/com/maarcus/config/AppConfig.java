package com.maarcus.config;

import com.maarcus.model.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name = "desktop1")
	@Scope(value = "prototype")
	// Can also do this -> @Bean(name = { "desktop1", "desktop2", ... })
	
	public Desktop desktop() {
		return new Desktop();
	}
}
