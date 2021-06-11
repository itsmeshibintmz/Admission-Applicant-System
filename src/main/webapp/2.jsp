<!DOCTYPE html>
<%@page import="com.sgca.model.Application"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Personal Details</title>
<link rel="icon" href="images/icon2.png" type="image/icon type">
<link rel="stylesheet" href="./styles/textbox.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
	crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    history.forward();
</script>
</head>
<body>
	<%
	Application details = (Application) session.getAttribute("userdata");
	%>
	<div class="longbox">
		<form class="row g-3 insidebox" method="post" action="./application">
			<h5>Your Application Number:
			<%=details.getApplicationNo()%></h5>
			<div class="progress">
  				<div class="progress-bar progress-bar-striped active" role="progressbar"
  					aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width:20%">
    				20%
  				</div>
			</div>
			<input type="hidden" name="action" value="page2"> 
			<h4>Personal Details</h4>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Name of the
					Applicant</label> <input name="name" type="text" class="form-control"
					id="inputEmail4" pattern="[a-zA-Z ]*$" title="Alphabets and Spaces only allowed" required>
			</div>
			<div class="col-md-4">
				<label for="inputState" class="form-label">Sex</label> <select
					name="gender" id="inputState" class="form-select" required>
					<option selected></option>
					<option>Male</option>
					<option>Female</option>
					<option>Other</option>
				</select>
			</div>
			<div class="col-md-6">
				<label for="inputState" class="form-label">Marital Status</label> <select
					name="relationshipstatus" id="inputState" class="form-select"
					required>
					<option selected></option>
					<option>Single</option>
					<option>Married</option>
					<option>Divorced</option>
					<option>Widow</option>
					<option>Widower</option>
				</select>
			</div>
			<div class="col-md-4">
				<label for="inputState" class="form-label">Physically
					Handicapped?</label> <select name="handicapped" id="inputState"
					class="form-select" required>
					<option selected></option>
					<option>No</option>
					<option>Yes</option>
				</select>
			</div>
			<div class="col-12">
				<div class="mb-3">
					<label for="exampleFormControlTextarea1" class="form-label">Address</label>
					<textarea name="address" class="form-control"
						id="exampleFormControlTextarea1" rows="3" required></textarea>
				</div>
			</div>
			<div class="col-md-8">
				<label for="inputZip" class="form-label">Phone Number</label>
				<div class="input-group mb-3">
					<select name="countrycode"
						class="btn btn-outline-secondary dropdown-toggle" type="button"
						data-bs-toggle="dropdown" aria-expanded="false">
						<option>+91</option>
					</select> <input name="phoneno" type="text"
						placeholder="Enter 10 digit phone number" class="form-control"
						aria-label="Text input with dropdown button" pattern="[0-9]{10}"
						title="Enter 10 digit Phone number" required>
				</div>
			</div>
			<div class="col-md-2">
				<label for="inputZip" class="form-label">Pin Code</label> <input
					name="zip" type="text" class="form-control" id="inputZip" pattern="[0-9]{6}" title="Enter 6 digit PIN Code" required>
			</div>
			<div class="form-group has-success has-feedback">
				<label for="inputSuccess" class="col-sm-2 control-label">Email</label> <input
					name="email" type="email" placeholder="name@email.com"
					class="form-control" id="inputSuccess"
					pattern="[A-Za-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>
					<span class="glyphicon glyphicon-ok form-control-feedback"></span>
			</div>
			<div class="col-12 ">
				<button type="submit" name="savenext" class="btn btn-primary">Save
					and Next</button>
				<button type="submit" name="draft" class="btn btn-warning">Save
					Draft</button>
				<a href="./application?cancel=true" name="cancel"
					class="btn btn-danger">Cancel</a>
			</div>
		</form>
	</div>
</body>
</html>