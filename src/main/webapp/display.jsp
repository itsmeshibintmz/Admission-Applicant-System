<!DOCTYPE html>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.sgca.model.Application"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Preview</title>
<link rel="icon" href="images/icon2.png" type="image/icon type">
<link rel="stylesheet" href="styles/style.css" />
<link rel="stylesheet" href="styles/tabledesign.css" />
<link rel="stylesheet" href="styles/textbox.css" />
<link
href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700&display=swap"
rel="stylesheet"
/>
<script>
    history.forward();
</script>
</head>
<body>
	<%
	Application details = (Application) session.getAttribute("userdata");
	%>
	<h4 style="text-align: center;">
		Application Number:
		<%=details.getApplicationNo()%></h4>
		<h2 style="text-align: center;">Applicant Information</h2>
		<!--selection-->
		<div class="viewtablecontainer">
			<div class="tableview">
			  <table class="maintable" border="1">
				<thead>
				  <th colspan="2">Personal Details</th>
				</thead>
				<tr>
				  <td>Name</td>
				  <td><%=details.getStudName() %></td>
				</tr>
				<tr>
				  <td>Sex</td>
				  <td><%=details.getSex() %></td>
				</tr>
				<tr>
				  <td>Physically Handicapped</td>
				  <td><%=details.getHandicapped() %></td>
				</tr>
				<tr>
				  <td>Address</td>
				  <td><%=details.getAddress() %></td>
				</tr>
				<tr>
				  <td>Pincode</td>
				  <td><%=details.getPincode() %></td>
				</tr>
				<tr>
				  <td>Phone Number</td>
				  <!-- Displays the Double value without decimal Format -->
				  <td><%=new DecimalFormat("0").format(details.getPhno()) %></td>
				</tr>
				<tr>
				  <td>Email</td>
				  <td><%=details.getEmail() %></td>
				</tr>
			  </table>
		  </div>
		  <div class="tableview">
			<table class="maintable" border="1">
			  <thead>
				<th colspan="2">Community Details</th>
			  </thead>
			  <tr>
				<td>Religion</td>
				<td><%=details.getReligionCaste() %></td>
			  </tr>
			  <tr>
				<td>Caste</td>
				<td><%=details.getRegType() %></td>
			  </tr>
			  <tr>
				<td>Annual Income</td>
				<!-- Displays the Double value without decimal Format -->
				<td><%=new DecimalFormat("0").format(details.getAnnualIncome()) %></td>
			  </tr>
			  <thead>
				<th colspan="2">Extra Curricular Activities</th>
			  </thead>
			  <tr>
				<td>NCC/NSS</td>
				<td><%=details.getNccNss() %></td>
			  </tr>
			  <tr>
				<td>Sports/Games</td>
				<td><%=details.getSportsGames() %></td>
			  </tr>
			  <tr>
				<td>Literary/Cultural</td>
				<td><%=details.getLiteraryCultural() %></td>
			  </tr>
			</table>
		</div>
		<div class="tableview">
		  <table class="maintable" border="1">
		  <thead>
			  <th colspan="2">Educational Details</th>
			</thead>
			<thead>
			  <th colspan="2">SSLC</th>
			</thead>
			<tr>
			  <td>DOB</td>
			  <td><%=details.getDateOfBirth() %></td>
			</tr>
			<tr>
			  <td>Register Number</td>
			  <!-- Displays the Double value without decimal Format -->
			  <td><%=new DecimalFormat("0").format(details.getSslcRegisNo()) %></td>
			</tr>
			<tr>
			  <td>Year & Month</td>
			  <td><%=details.getSslcDate() %></td>
			</tr>
			<tr>
			  <td>School</td>
			  <td><%=details.getSslcSchool() %></td>
			</tr>
			<tr>
			  <td>Board</td>
			  <td><%=details.getSslcBoard() %></td>
			</tr>
			<thead>
			  <th colspan="2">HSE</th>
			</thead>
			<tr>
			  <td>Category</td>
			  <td><%=details.getPlusTwoCat() %></td>
			</tr>
			<tr>
			  <td>Year and Month</td>
			  <td><%=details.getPlusTwoDate() %></td>
			</tr>
			<tr>
			  <td>Register Number</td>
			  <!-- Displays the Double value without decimal Format -->
			  <td><%=new DecimalFormat("0").format(details.getPlusTwoRegNo()) %></td>
			</tr>
			<tr>
			  <td>School</td>
			  <td><%=details.getPlusTwoSchool() %></td>
			</tr>
			<tr>
			  <td>Board</td>
			  <td><%=details.getPlusTwoBoard() %></td>
			</tr>
		  </tr>
		  </table>
	   </div>
	   <div class="tableview">
		<table class="maintable" border="1">
		  <thead>
			<th colspan="2">Applicant Details</th>
		  </thead>
		  <tr>
			<td>MGU Application No</td>
			<td><%=details.getMguNumber() %></td>
		  </tr>
		  <tr>
			<td>Subject</td>
			<td><%=details.getSubject() %></td>
		  </tr>
		  <thead>
			<th colspan="2">Parent Details</th>
		  </thead>
		  <tr>
			<td>Name of Parent/Guardian</td>
			<td><%=details.getParentName() %></td>
		  </tr>
		  <tr>
			<td>Occupation</td>
			<td><%=details.getParentJob() %></td>
		  </tr>
		  <tr>
			<td>Relationship</td>
			<td><%=details.getRelGuardian() %></td>
		  </tr>
		</table>
	   </div>
	   </div>
	   <form action="./application">
			<div class="viewtablecontainer">
				<input type="hidden" name="action" value="lastpage">
				<button type="submit" style="height:40px;background-color:black;color:white" class="btn btn-danger">Submit
					Application</button>
			</div>
		</form>
	</body>
</html>