package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
   private PrintWriter printWriter;
   private int firstNumber;
   private int secondNumber;
    public AcceptDetailsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  printWriter =response.getWriter();
	  firstNumber=Integer.parseInt(request.getParameter("firstNumber"));
	  secondNumber=Integer.parseInt(request.getParameter("secondNumber"));
	  int result=firstNumber+secondNumber;
	  
	  printWriter.println("Addition of "+firstNumber+" & "+secondNumber+" is: "+result);;
	  
	}

}
