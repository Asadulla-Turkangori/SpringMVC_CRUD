<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body{
		display:flex;
		justify-content:space-around;
		flex-direction: column;
		align-items: center;
		background-color: #E5E1DA;
	}
	td{
		padding:10px;
		font-size: 18px;	
	}
	input{
		width:200px;
		height: 30px;
		padding:5px;
	}
	.btn{
		padding:10px;
		cursor:pointer;
		font-weight: 700;
		background-color: #1DA1F2;
		color:white;
		height: 40px;
		width: 150px;
		border-radius: 10px;
	}
	.btn:hover{
		color:black;
	}
	fieldset{
		background-color: #EEF5FF;
	}
</style>
</head>
<body>
	<h1>Update Employee Details</h1>
	
	<fieldset>
		<form action="updateform">
			<table>
				<tr><td>Employee Id :</td><td><input type="int" name="empid" value="<%= request.getParameter("empid") %>"></td></tr>
				<tr><td>Employee Name :</td><td><input type="text" name="name" value="<%= request.getParameter("name") %>"></td></tr>
				<tr><td>Employee JobRole :</td><td><input type="text" name="jobrole" value="<%= request.getParameter("jobrole") %>"></td></tr>
				<tr><td>Employee Dept :</td><td><input type="text" name="dept" value="<%= request.getParameter("dept") %>"></td></tr>
				<tr><td>DeptId :</td><td><input type="int" name="deptid" value="<%= request.getParameter("deptid") %>"></td></tr>
				<tr><td></td><td><input type="submit" value="Update Details" class="btn"></td></tr>
			</table>
		</form>
	</fieldset>
</body>
</html>