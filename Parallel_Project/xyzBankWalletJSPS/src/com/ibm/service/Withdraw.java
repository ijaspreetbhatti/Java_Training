package com.ibm.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Withdraw")
public class Withdraw extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("accNo") != null) {
			long accountNumber = Long.parseLong(request.getSession().getAttribute("accNo").toString());
			long amount = Long.parseLong(request.getParameter("amount"));
			
			response.getWriter().print("<script>alert('" + new TransactionManagementService().withdrawAmount(accountNumber, amount) + "')</script>");
			response.setContentType("jsp");
			RequestDispatcher dp = request.getRequestDispatcher("BankingHome.jsp");
			dp.include(request, response);
		
		} else {
			response.sendRedirect("BankingHome.jsp");
		}

	}

}
