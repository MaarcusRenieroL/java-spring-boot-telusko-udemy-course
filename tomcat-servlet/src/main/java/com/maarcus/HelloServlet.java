package com.maarcus;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
  public void serve(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("In serve method");
  }
}
