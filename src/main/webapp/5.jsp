<!DOCTYPE html>
<%@page import="com.sgca.model.Application"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Parent Details</title>
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
	<%Application details = (Application)session.getAttribute("userdata"); %>
	<div class="outsidebox">
	<div class="longbox">
			<form class="row g-3 insidebox" action="./application">
			<h5>Applicant Name: <%=details.getStudName() %></h5>
			<h5>Your Application Number:
			<%=details.getApplicationNo()%></h5>
			<div class="progress">
  				<div class="progress-bar progress-bar-striped active" role="progressbar"
  					aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width:80%">
    				80%
  				</div>
			</div>
				<!--selection-->
				<input type="hidden" name="action" value="page5">
				<h2>Guardian Details</h2>
				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">Name of
						Parent/Guardian</label> <input type="text" class="form-control"
						name="parentName" id="inputEmail4" 
						pattern="[a-zA-Z ]*$" 
						title="Alphabets and Spaces only allowed" required>
				</div>
				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">His/Her
						Occupation</label> <input type="text" class="form-control"
						name="occupationParent" id="inputEmail4" 
						pattern="[a-zA-Z ]*$" 
						title="Alphabets and Spaces only allowed" required>
				</div>
				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">Relationship to
						Guardian</label> <input type="text" class="form-control"
						name="relationParent" id="inputEmail4"
						 pattern="[a-zA-Z ]*$" 
						 title="Alphabets and Spaces only allowed" required>
				</div>
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