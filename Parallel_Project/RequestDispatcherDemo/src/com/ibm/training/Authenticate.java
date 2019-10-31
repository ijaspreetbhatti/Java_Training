package com.ibm.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	
	PrintWriter out;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		out = response.getWriter();
		
		
		String userName = request.getParameter("uName");
		
		String userPassword = request.getParameter("uPass");
		
		//Check whether valid
		if(userName.trim().equals("")) {
			out.println("Username can't be left empty...");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
			
			dispatcher.include(request, response);
		}
		else if(userName.trim().equals("adminIBM")) {
RequestDispatcher dispatcher = request.getRequestDispatcher("/success");
			
			dispatcher.forward(request, response);
		}
		else {
			out.println("Invalid username, please try again...");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
			
			dispatcher.include(request, response);
		}
	}

}
