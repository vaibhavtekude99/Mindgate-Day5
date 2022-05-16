package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
	
	private PrintWriter printWriter;
	private Set<Employee> employeeSet;
	private EmployeeDAO dao = new EmployeeDAO();
    public GetAllEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		printWriter=response.getWriter();
	  employeeSet=	dao.getAllEmployee();
	  for (Employee employee : employeeSet)
	  {
		printWriter.println(employee);
	}
		
				
	
}
}
