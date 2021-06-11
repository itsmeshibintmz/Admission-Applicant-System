<!DOCTYPE html>
<%@page import="com.sgca.model.Application"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Extra Curricular Activities</title>
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
<script>
    history.forward();
</script>
</head>
<body>
	<%
	Application details = (Application) session.getAttribute("userdata");
	%>
	<div class="outsidebox">
	<div class="longbox">
			<form class="row g-3 insidebox" action="./application">
			<h5>Applicant Name: <%=details.getStudName() %></h5>
			<h5>Your Application Number:
			<%=details.getApplicationNo()%></h5>
			<div class="progress">
  				<div class="progress-bar progress-bar-striped active" role="progressbar"
  					aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width:100%">
    				100%
  				</div>
			</div>
				<!--selection-->
				<!---ncc/nss-->
				<input type="hidden" name="action" value="page6">
				<h2>Extra Curricular Activities</h2>
				<div>
					<label for="exampleFormControlInput1" class="form-label">NCC/NSS</label>
					<div class="form-check form-check-inline">
						<select name="nccnss" id="inputState" class="form-select" required> 
							<option selected></option>
							<option value="NCC">NCC</option>
							<option value="NSS">NSS</option>
							<option value="">None</option>
						</select>
					</div>
				</div>
				<!---ncc/nss end-->
				<!---sports/games-->
				<div>
					<label for="exampleFormControlInput1" class="form-label">Sports/Games</label>
					<div class="form-check form-check-inline">
						<select name="sportsgames" id="inputState" class="form-select" required>
							<option selected></option>
							<option value="Cricket">Cricket</option>
							<option value="Football">Football</option>
							<option value="Tennis">Tennis</option>
							<option value="Volleyball">Volleyball</option>
							<option value="Shuttle">Shuttle</option>
							<option value="">None of the Above</option>
						</select>
					</div>
				</div>
				<!---sports/games end-->
				<!--literal/cultural--->
				<div>
					<label for="exampleFormControlInput1" class="form-label">Literal/Cultural</label>
					<div class="form-check form-check-inline">
						<select name="literalcultural" id="inputState" class="form-select" required>
							<option selected></option>
							<option value="Dance">Dance</option>
							<option value="Music">Music</option>
							<option value="Photography">Photography</option>
							<option value="Film">Film</option>
							<option value="">None of the Above</option>
						</select>
					</div>
				</div>
				<!--literal/cultural end--->
				<div class="col-12">
					<button type="submit" name="savenext" class="btn btn-primary">Save
						and Next</button>
					<button type="submit" name="draft" class="btn btn-warning">Save
						Draft</button>
					<a href="./application?cancel=true" name="cancel"
						class="btn btn-danger">Cancel</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>