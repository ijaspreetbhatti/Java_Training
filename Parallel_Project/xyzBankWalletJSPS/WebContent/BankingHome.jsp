<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.ibm.service.AccountManagementService"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script>
	function toggleView(id) {
		var x = document.getElementById(id);
		if (x.style.display === "none") {
			x.style.display = "block";
		} else {
			x.style.display = "none";
		}
	}
</script>
</head>
<body>
	<%!private String showBalance(long accountNumber) {
		long balance = new AccountManagementService().getBalance(accountNumber);
		if (balance == -1) {
			return "Can't connect to Server!!";
		} else {
			return "Account Balance: " + balance;
		}
	}%>
	<h1 style="text-align: center;">
		<span class="badge badge-dark">Welcome to XYZ BANK WALLET</span>
	</h1>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4">
				<div class='card card-body'>
					<h1 style="text-align: center;">
						<span class='badge badge-dark'>Account Details</span>
					</h1>
					<h3>
						<span class='badge badge-dark'>Account Number: <%
							if (request.getSession().getAttribute("accNo") != null) {
								out.append(request.getSession().getAttribute("accNo").toString());
							} else {
								response.sendRedirect("WalletHome.jsp");
							}
						%>
						</span>
					</h3>
					<h3>
						<span class='badge badge-dark'> <%
						 	if (request.getSession().getAttribute("accNo") != null) {
						 		out.print(showBalance(Long.parseLong(request.getSession().getAttribute("accNo").toString())));
						 	} else {
						 		response.sendRedirect("WalletHome.jsp");
						 	}
						 %>
						</span>
					</h3>
					<a class='btn btn-danger' href='LogOut'>Log Out</a>
				</div>
			</div>
			<div class="col-md-8">
				<div class="navbar bg-dark">
					<button class="btn btn-secondary"
						onclick="toggleView('depositForm')">Deposit</button>
					<button class="btn btn-secondary"
						onclick="toggleView('withdrawForm')">Withdraw</button>
					<button class="btn btn-secondary"
						onclick="toggleView('transferForm')">Transfer</button>
					<a class="btn btn-secondary" href="Transactions">Show all
						transactions</a>
				</div>
				<div class="card card-body">
					<form class="form-inline" action="Deposit" id="depositForm"
						style="display: block;">
						<h2>Deposit</h2>
						<input class="form-control" type="number" placeholder="Amount"
							name="amount"> <input class="btn btn-secondary"
							type="submit" value="Deposit">
					</form>

					<form class="form-inline" id="withdrawForm" style="display: none;"
						action="Withdraw">
						<h2>Withdraw</h2>
						<input class="form-control" type="number" placeholder="Amount"
							name="amount"> <input class="btn btn-secondary"
							type="submit" value="Withdraw">
					</form>

					<form class="form-inline" id="transferForm" style="display: none;"
						action="Transfer">
						<h2>Transfer</h2>
						<input class="form-control" type="number" placeholder="Amount"
							name="amount"> <input class="form-control" type="number"
							placeholder="Reciever's Account" name="tgtAcc"> <input
							class="btn btn-secondary" type="submit" value="Transfer">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>