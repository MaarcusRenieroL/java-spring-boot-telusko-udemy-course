package com.maarcus;

// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// WebServlet annotation is used to map a servlet with the specified route
// Works only with external tomcat
// @WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public void service(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("In Service");
  }
}
