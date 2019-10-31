package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("userName") == null || session.getAttribute("userName") == "") {
		
	    //Save the username into session
		session.setAttribute("userName", userName);
		
		response.sendRedirect("dashboard");
		
		}
		else
			response.sendRedirect("dashboard");
		
	}

}
