package com.ibm;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my")
public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get a reference to the database connection object already created
		Connection conn = (Connection) request.getServletContext().getAttribute("dbCon");
		
		if(conn != null) {
			response.getWriter().print("Successfully connected to db...");
		}
		
		request.setAttribute("var", conn);
	}

}
