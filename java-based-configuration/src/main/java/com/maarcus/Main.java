package com.maarcus;

import com.maarcus.config.AppConfig;
import com.maarcus.model.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Desktop desktop1 = context.getBean(Desktop.class);
		Desktop desktop2 = context.getBean(Desktop.class);
		
		desktop1.compile();
		desktop2.compile();
	}
}