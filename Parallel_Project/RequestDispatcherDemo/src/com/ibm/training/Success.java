package com.ibm.training;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success
 */
@WebServlet(
		urlPatterns = "/success", 
		initParams = {
		@WebInitParam(name = "jdbcDriver", value = "com.mysql.jdbc.Driver"), 
		@WebInitParam(name = "phoneLength", value = "10")
		})
public class Success extends HttpServlet {
	
	@Override
		public void init(ServletConfig config) throws ServletException {
		
			super.init(config);
			System.out.println("Inside init");
		}
	
	@Override
		public void destroy() {
			System.out.println("inside destroy()...");
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String dbDriver = getInitParameter("jdbcDriver");
		
		System.out.println("DB Driver to connect : " + dbDriver);
		response.getWriter().append("Welcome " + request.getParameter("uName"));
	}

	
}


//init(ServletConfig)
//
//service(HttpServletRequest, HttpServletResponse) -> doGet() or doPost()
//
//destroy()
