package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String user = request.getCookies()[0].getValue();
		if(user !=null) {
			response.getWriter().append("<h1>Welcome, "+ user +"</h1><br><a href=\"Logout\">Log out</a>");
		}
		else {
			response.getWriter().append("Invalid Login");
			response.sendRedirect("index.html");
		}
	}

}
