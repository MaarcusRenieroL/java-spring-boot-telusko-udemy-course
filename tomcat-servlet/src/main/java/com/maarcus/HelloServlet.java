package com.maarcus;

import java.io.IOException;
import java.io.PrintWriter;

// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// WebServlet annotation is used to map a servlet with the specified route
// Works only with external tomcat
// @WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    System.out.println("In Service");

    // setContentType() function will tell the response what type of data the server should send
    response.setContentType("text/html");

    // getWriter() function is used to write the response body back to the client
    PrintWriter out = response.getWriter();

    // println() function is similar to System.out.println() but the only difference is instead of printing contents in the console, the println function from the getWriter() will write it in the response
    out.println("<h2><b>Hello World</b></h2>");
  }
}
