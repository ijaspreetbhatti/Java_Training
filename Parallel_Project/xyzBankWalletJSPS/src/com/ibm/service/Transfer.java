package com.ibm.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Transfer")
public class Transfer extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("accNo") != null) {
			String srcAccountNumber = request.getSession().getAttribute("accNo").toString();
			String tgtAccountNumber = request.getSession().getAttribute("accNo").toString();
			String amount = request.getParameter("amount");
			if (srcAccountNumber != null && tgtAccountNumber != null && amount != null) {
				response.getWriter().print("<script>alert('" + new TransactionManagementService().fundTransfer(Long.parseLong(srcAccountNumber),Long.parseLong(tgtAccountNumber), Long.parseLong(amount)) + "')</script>");
				response.setContentType("jsp");
				RequestDispatcher dp = request.getRequestDispatcher("BankingHome.jsp");
				dp.include(request, response);
			} else {
				response.sendRedirect("BankingHome.jsp");
			}
		} else {
			response.sendRedirect("BankingHome.jsp");
		}

	}

}
