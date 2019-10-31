package com.ibm.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Deposit")
public class Deposit extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("accNo") != null) {
			String accountNumber = request.getSession().getAttribute("accNo").toString();
			String amount = request.getParameter("amount");
			if (accountNumber == null || amount == null) {
					response.sendRedirect("BankingHome.jsp");
			} else {
				
				response.getWriter().print("<script>alert('" + new TransactionManagementService().depositAmount(Long.parseLong(accountNumber), Long.parseLong(amount)) + "')</script>");
				response.setContentType("jsp");
				RequestDispatcher dp = request.getRequestDispatcher("BankingHome.jsp");
				dp.include(request, response);
				
				
				
				/*
				 * PrintWriter out = response.getWriter(); out.append("<h1>" + new
				 * TransactionManagementService().depositAmount(Long.parseLong(accountNumber),
				 * Long.parseLong(amount)) + "</h1>");
				 * out.append("<br><a href='BankingHome.jsp'>Go Back</a>");
				 */
			}
		} else {
			response.sendRedirect("BankingHome.jsp");
		}

	}

}
