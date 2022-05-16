package com.mindgate.controllerq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
       
	PrintWriter printWriter;
	String userId;
	String password;
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		printWriter=response.getWriter();
		userId=request.getParameter("loginid");
		password=request.getParameter("password");
	
		
		
		
		if("vaibhav".equals(userId)&& "vaibhav123".equals(password))
		{
			printWriter.println("Welcome User!!!!");
			printWriter.println(userId);
		}
		else
		  	printWriter.println("Invalid Credential");
		
		
		
	  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

	printWriter=response.getWriter();
	userId=request.getParameter("loginid");
	password=request.getParameter("password");

	
	
	
	if("vaibhav".equals(userId)&& "vaibhav123".equals(password))
	{
		printWriter.println("Welcome User!!!!");
		printWriter.println(userId);
	}
	else
	  	printWriter.println("Invalid Credential");
	
	}
	
  
	
}
