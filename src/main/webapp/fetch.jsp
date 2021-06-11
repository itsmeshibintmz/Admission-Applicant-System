<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Course Selection</title>
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

<nav class="navbar navbar-expand-lg navbar-light bg-light">

		<!-- Image and text -->
		<nav class="navbar navbar-light bg-light">
			<a class="navbar-brand" href="start.jsp"> <img src="./images/logo.png"
				width="30" height="30" class="d-inline-block align-top" alt="">
				Student Registration
			</a>
		</nav>
	</nav>
	<div class="outsidebox">
		<form class="row g-3 insidebox" method="post" action="./application">
			<input type="hidden" name="action" value="fetchpage">
			<!--selection-->
			<div class="col-md-4">
				<label for="inputState" class="form-label">Select Your
					Course</label> <select name="Course" id="inputState" class="form-select" required>
					<option value=""></option>
					<option value="BA English">BA English</option>
					<option value="BA Economics">BA Economics</option>
					<option value="BA Malayalam">BA Malayalam</option>
					<option value="BA Political Science">BA Political Science</option>
					<option value="B.Com Co-operation">B.Com Co-operation</option>
					<option value="B.Com Taxation">B.Com Taxation</option>
					<option value="B.Com Computer Application">B.Com Computer
						Application</option>
					<option value="B.com Marketing">B.com Marketing</option>
					<option value="B.Com computer Application">B.Com computer
						Application</option>
					<option
						value="B.Com Office Management &
						Secretarial Practice">B.Com
						Office Management & Secretarial Practice</option>
					<option value="Bachelor of Computer Application">Bachelor
						of Computer Application</option>
					<option value="BSC Physics">BSC Physics</option>
					<option value="BSC Chemistry">BSC Chemistry</option>
					<option value="BSC Mathematics">BSC Mathematics</option>
					<option value="BSC Botany">BSC Botany</option>
				</select>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">MGU Application
					Number</label> <input type="text" class="form-control" name="mguno"
					id="inputEmail4" pattern="\d{9}"
					onkeypress="return onlyNumberKey(event)" maxlength="9"
					title="Enter 9 Digit MGU Application Number" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Admission Number</label>
				<input type="text" class="form-control" name="admno"
					id="inputEmail4" required>
			</div>

			<div class="col-12">
				<button type="submit" name="s1" class="btn btn-primary">Fetch</button>
			</div>
		</form>
	</div>
</body>
</html>