package com.ibm.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AccountCheck")
public class AccountCheck extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accNo = request.getParameter("accNo");
		if (accNo != null) {
			if (new AccountManagementService().isAnAccount(Long.parseLong(accNo))) {
				request.getSession().setAttribute("accNo", accNo);
				response.sendRedirect("BankingHome.jsp");
			} else {
				response.getWriter().print("<script>alert('Invalid Account')</script>");
				response.setContentType("jsp");
				RequestDispatcher dp = request.getRequestDispatcher("WalletHome.jsp");
				dp.include(request, response);
			}
		} else {
			response.sendRedirect("WalletHome.jsp");
		}
	}
}
