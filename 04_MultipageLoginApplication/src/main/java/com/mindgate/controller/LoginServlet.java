package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private String userId;
    private String password;
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		userId=request.getParameter("loginId");
		password=request.getParameter("password");
		
		
		if("vaibhav".equals(userId) && "vaibhav123".equals(password))
		{
			response.sendRedirect("success.html");
		}	
		else
			response.sendRedirect("failure.html");
	
	}

}
