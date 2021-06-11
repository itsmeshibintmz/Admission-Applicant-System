<!DOCTYPE html>
<%@page import="com.sgca.model.Application"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Educational Details</title>
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
	function onlyNumberKey(evt) {
          
        // Only ASCII charactar in that range allowed
        var ASCIICode = (evt.which) ? evt.which : evt.keyCode
        if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
            return false;
        return true;
    }
	</script>
<script>
	function handleChange(input) {
	    if (input.value < 0) input.value = 0;
	    if (input.value > 100) input.value = 100;
	  }
	</script>
<script>
    history.forward();
</script>
</head>
<body>
	<%
	Application details = (Application) session.getAttribute("userdata");
	%>
	<div class="longbox">
		<form class="row g-3 insidebox" action="./application">
			<h5>Applicant Name: <%=details.getStudName() %></h5>
			<h5>Your Application Number:
			<%=details.getApplicationNo()%></h5>
			<div class="progress">
  				<div class="progress-bar progress-bar-striped active" role="progressbar"
  					aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width:40%">
    				40%
  				</div>
			</div>
			<!-- sslc-->
			<input type="hidden" name="action" value="page3">
			<h2>Educational Details</h2>
			<h4>SSLC</h4>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Date of
					Birth(As per SSLC)</label> <input type="date" name="sslcdob" class="form-control"
					id="inputEmail4" min="1980-01-01" max="2005-12-31" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Register Number</label>
				<input type="text" onkeypress="return onlyNumberKey(event)"
					pattern="\d*" maxlength="12" placeholder="Register Number"
					name="sslcregno" class="form-control" id="inputEmail4" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">School</label> <input
					type="text" name="schoolname" placeholder="School Name"
					class="form-control" pattern="[a-zA-Z ]*$" title="Alphabets and Spaces only allowed" id="inputEmail4" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">SSLC date</label> <input
					type="date" name="sslcdate" class="form-control" id="inputEmail4"
					min="2012-01-01" max="2016-12-21" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">10 th percentage</label>
				<input type="text" name="tenthpercentage" placeholder="%"
					onchange="handleChange(this);" class="form-control"
					id="inputEmail4" required pattern="[0-9]+" title="Enter Percentage">
			</div>
			<div class="col-md-4">
				<label for="inputState" class="form-label">SSLC Board</label> <select
					name="sslcboard" id="inputState" class="form-select" required>
					<option selected></option>
					<option value="CBSC">CBSC</option>
					<option value="ICSC">ICSC</option>
					<option value="State">State Board</option>
				</select>
			</div>
			<!--sslc-->
			<!--plus2-->
			<h4>HSE</h4>
			<div class="col-md-4">
				<label for="inputState" class="form-label">HSE category</label> <select
					name="plus2cat" id="inputState" class="form-select" required>
					<option selected></option>
					<option value="Commerce">Commerce</option>
					<option value="Humanities">Humanities</option>
					<option value="Vocational">Vocational</option>
					<option value="Biology Science">Biology Science</option>
					<option value="Computer Science">Computer Science</option>
				</select>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Register Number</label>
				<input name="plus2regno" type="text" onkeypress="return onlyNumberKey(event)" class="form-control"
					pattern="\d*" maxlength="12" 
					placeholder="Register Number" id="inputEmail4" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">School</label> <input
					name="plus2school" type="text" placeholder="School Name" pattern="[a-zA-Z ]*$" title="Alphabets and Spaces only allowed" class="form-control"
					id="inputEmail4" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">HSE date</label> <input
					type="date" name="plus2date" class="form-control" id="inputEmail4"
					min="2015-01-01" max="2018-01-01" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">HSE Percentage</label>
				<input type="text" name="pluspercentage" placeholder="%"
					pattern="[0-9]+" onchange="handleChange(this);"
					title="Enter Percentage" class="form-control" id="inputEmail4"
					required>
			</div>
			<div class="col-md-4">
				<label for="inputState" class="form-label">Board</label> <select
					name="plus2board" id="inputState" class="form-select" required>
					<option selected></option>
					<option value="H.S.C">H.S.C.</option>
					<option value="V.H.S.C">V.H.S.C.</option>
					<option value="CBSC">CBSC</option>
					<option value="ICSC">ICSC</option>
					<option value="National Open School">National Open School</option>
				</select>
			</div>
			<!---plus2 ends-->
			<h4>Previous Course</h4>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Course Name</label> <input
					name="lastcname" type="text" pattern="[a-zA-Z ]*$" title="Alphabets and Spaces only allowed" class="form-control" id="inputEmail4"
					required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">School/College
					Name</label> <input name="lastcschoolname" type="text" pattern="[a-zA-Z ]*$" title="Alphabets and Spaces only allowed" class="form-control"
					id="inputEmail4" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">TC Number</label> <input
					name="lastctcno" type="text" class="form-control" id="inputEmail4"
					pattern="[0-9]{2,10}" title="Enter Correct TC Number" required>
			</div>
			<div class="col-md-6">
				<label for="inputEmail4" class="form-label">Date of TC</label> <input
					name="lastcdatetc" type="date" class="form-control"
					id="inputEmail4" required>
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