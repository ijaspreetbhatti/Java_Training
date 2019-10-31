package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		if(request.getSession().getAttribute("userName") == null) {
			response.getWriter().print("Unauthorized access, Please login first..");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
		response.getWriter().append("Welcome ").append(request.getSession().getAttribute("userName").toString());
		response.getWriter().append("<br><a href='logout'>Logout</a>");
	}
	}

}
