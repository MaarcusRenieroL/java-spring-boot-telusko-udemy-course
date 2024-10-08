package com.maarcus;

import com.maarcus.config.AppConfig;
import com.maarcus.model.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Desktop desktop = context.getBean("desktop1", Desktop.class);
		
		desktop.compile();
	}
}