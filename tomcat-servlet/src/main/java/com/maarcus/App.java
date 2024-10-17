package com.maarcus;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
	public static void main(String[] args) throws LifecycleException {
		System.out.println("Hello World!");
		
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(1000);

		Context context = tomcat.addContext("", null);
		Tomcat.addServlet(context, "hs", new HelloServlet());

		context.addServletMappingDecoded("/hello", "hs");

		tomcat.start();
		tomcat.getServer().await();
	}
}
