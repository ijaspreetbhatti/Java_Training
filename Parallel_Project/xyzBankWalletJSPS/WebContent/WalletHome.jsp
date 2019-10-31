<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script type="text/javascript">
	function checkPhoneLength() {
		numberF = document.getElementById('phn');
		console.log(numberF.value.toString().length);
		if (numberF.value.toString().length == 10) {
			document.getElementById('createBtn').disabled = false;
		} else {
			document.getElementById('createBtn').disabled = true;
		}
	}
</script>
</head>
<body>
	<h1 style="text-align: center;">
		<span class="badge badge-dark">Welcome to XYZ BANK WALLET</span>
	</h1>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<form class="form" action="AccountCheck">
							<h3>
								<label class="card-title">Enter Account Number</label>
							</h3>
							<input class="form-control" type="number"
								placeholder="Account Number" name="accNo" autofocus required><br>
							<input class="btn btn-primary" type="submit"
								value="Login Account">
						</form>
					</div>
				</div>
			</div>

			<div class="col-md-8">
				<div class="card">
					<div class="card-body">
						<form class="form" action="CreateAccount">
							<h3>
								<label class="card-title">Create Account</label>
							</h3>
							<input class="form-control" type="text" placeholder="Name"
								name="uName" autofocus required><br> <input
								class="form-control" type="text" placeholder="Address"
								name="address" autofocus required><br> <input
								class="form-control" type="number"
								placeholder="10 Digit Phone Number" name="phone"
								onkeyup="checkPhoneLength()" id="phn" autofocus required><br>
							<input class="btn btn-primary" type="submit"
								value="Create Account" id="createBtn">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>