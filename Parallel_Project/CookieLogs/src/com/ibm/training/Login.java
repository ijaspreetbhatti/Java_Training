package com.ibm.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(((String)request.getParameter("uname")).equals("Akhil")) {
			Cookie myCookie = new Cookie("uname", (String) request.getParameter("uname"));
			myCookie.setMaxAge(3600);
			response.addCookie(myCookie);
			response.sendRedirect("Home");
		} else {
			response.getWriter().append("Invalid User");
			response.sendRedirect("index.html");
		}
	}

}
