package com.ibm.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.bean.Transaction;

@WebServlet("/Transactions")
public class Transactions extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("accNo") != null) {
			PrintWriter out = response.getWriter();
			ArrayList<Transaction> transactions = new AccountManagementService().getTransactions(Long.parseLong(request.getSession().getAttribute("accNo").toString()));
			if (transactions == null) {
				out.print("<h1>Can't fetch or No Transactions!!</h1>");
			} else {
				out.print("<html><head><meta name='viewport' content='width=device-width, initial-scale=1'><link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'><script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script><script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js'></script><script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js'></script></head><body>");
				out.append("<div>" +
						"	<br style='text-align: center;'><h1>Transactions</h1><br>"+ 
						"	<table class='table table-bordered'>" + 
						"	<thead><tr><th>Date</th><th>Transaction ID</th><th>Amount</th><th>Type</th></tr></thead><tbody>");
				for (Transaction transaction : transactions) {
					out.append("<tr><td>" + transaction.getDate() + "</td><td>" + transaction.getTransactionId() + "</td><td>" + transaction.getAmount() + "</td><td>" + transaction.getType() + "</td></tr>");				
				}
				out.append("</tbody></table></div></body></html>");
			}
			out.append("<br><a href='BankingHome.jsp'>Go Back</a>");
		} else {
			response.sendRedirect("BankingHome.jsp");
		}
		
	}

}
