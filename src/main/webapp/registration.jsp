<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Registration</title>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<form onsubmit="register()" method="post">
			<p id="errorBlock"></p>
			<article class="card-body mx-auto" style="max-width: 500px;">
				<div class="form-group">
					<h3>Registration Page</h3>
				</div>
				<div class="form-group">
					<input required type="tel" name="phoneNumber" id="phone"
						pattern="^([6-9]{1})+([0-9]{9})$" class="form-control"
						placeholder="Enter Your Mobile Number" autofocus />
				</div>
				<div class="form-group">
					<div class="form-row">
						<div class="col">
							<input type="text" name="firstName" id="firstName"
								pattern="^[a-zA-Z\s]{3,50}$" class="form-control"
								placeholder="First name" required>
						</div>
						<div class="col">
							<input type="text" name="lastName" id="lastName"
								pattern="^[a-zA-Z\s]{1,50}$" class="form-control"
								placeholder="Last name" required>
						</div>
					</div>
				</div>
				<div class="form-group">
					<input class="form-control" required type="text" name="email"
						id="email" placeholder="Email Address"
						pattern="^[A-Za-z0-9+_.-]+@(.+)$" />
					<div class="status" id="status"></div>
				</div>

				<div class="form-group">
					<input class="form-control" type="text" name="userName"
						id="userName" pattern="^(?=.*[a-zA-Z])(?=.*[0-9]).{5,10}$"
						placeholder="Enter User Name" onkeyup="checkUserName()" required />
					<span id="userNameMsg"></span>
					<div id="errLast"></div>
				</div>
				<div class="form-group">
					<input required name="password" type="password"
						placeholder="Password" class="form-control inputpass"
						pattern="^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{5,10}$"
						id="password" /> <em>Note: min 5 characters max 10
						characters.</em>
				</div>
				<div class="form-group">
					<input required name="conformPassword" type="password"
						pattern="^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*_=+-]).{5,10}$"
						class="form-control inputpass" placeholder="Conform Password"
						id="conformPassword" onkeyup="checkPassword()" /><span id="MSG"></span>
				</div>

				<div class="form-group">
					<button class="btn btn-success" id="button" name="button"
						type="submit" disabled>Register</button>
				</div>
				<div class="form-group">
					<label>Already a User?</label> <a href="login.jsp">Login</a>
				</div>
			</article>
		</form>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js"
			integrity="sha512-bZS47S7sPOxkjU/4Bt0zrhEtWx0y0CRkhEp8IckzK+ltifIIE9EMIMTuT/mEzoIMewUINruDBIR/jJnbguonqQ=="
			crossorigin="anonymous" referrerpolicy="no-referrer"></script>
		<script src="js/customerdetail.js">
			
		</script>
	</main>
</body>
</html>