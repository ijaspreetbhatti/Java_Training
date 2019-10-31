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
 * Servlet implementation class MyFirstServlet
 */
@WebServlet(urlPatterns = {"/serv", "/myServ"})
public class MyFirstServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			processRequest(request, response);
		
		//Fetch the username from url/html
		String uName = request.getParameter("userName");
		
		response.getWriter().println("<b>Welcome " + uName + "</b>");
		
		//Redirect to a page
		//response.sendRedirect("other.html");
	
			//OR
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("other.html");
		
		dispatcher.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//Prints to the console
//		System.out.println("This servlet is served at : " + request.getServletContext());	
	
		//Prints to the browser
//		PrintWriter out = response.getWriter();		
		response.getWriter().println("Running Servlets now at : " + request.getContextPath());
	}


}
