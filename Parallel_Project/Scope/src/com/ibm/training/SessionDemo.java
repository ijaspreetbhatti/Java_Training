package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demo")
public class SessionDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get a reference to the session object
		HttpSession session = request.getSession();
		
		//Put some data into the session
		session.setAttribute("myData", "Stored in a session");
		
		response.sendRedirect("other");
		
//		response.getWriter().print("Data in session: " + session.getAttribute("myData"));
	}

}
