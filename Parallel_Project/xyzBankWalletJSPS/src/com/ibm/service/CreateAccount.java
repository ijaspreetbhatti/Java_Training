package com.ibm.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uName");
		String phoneNumber = request.getParameter("phone");
		String address = request.getParameter("address");
		if(name != null || phoneNumber != null || address != null) {
			response.getWriter().append("<h1>" + new AccountManagementService().createAccount(name, Long.parseLong(phoneNumber), address) + "</h1>");
			response.getWriter().append("<br><a href='WalletHome.jsp'>Go Back</a>");
		} else {
			response.sendRedirect("WalletHome.jsp");
		}
	}

}
