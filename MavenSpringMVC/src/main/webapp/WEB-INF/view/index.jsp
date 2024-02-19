
<%@page import="com.tap.Entity.EmployeeEntity"%>
<%@page import="java.util.List"%>
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
		background-color: #E5E1DA;
	}
	
	button{
		padding:10px;
		cursor:pointer;
		font-weight: 700;
		background-color: #1DA1F2;
		color:white;
	}
	button:hover, a:hover{
		color:black;
	}
	button a{
		text-decoration: none;
		color:white;
	}
	a{
		text-decoration: none;
	}
	th,td{
		padding:10px;
	}
	table{
		background-color: #EEF5FF;
	}
</style>
</head>
<body>

		<form>
		<h1>Employee Details</h1>
			<table border>	
			<tr>
				<th>Employee ID</th><th>Employee Name</th><th>Employee JobRole</th><th>Employee Department</th><th>Department ID</th><th>Actions</th>
			</tr>
	<%
		List<EmployeeEntity> list = (List<EmployeeEntity>)request.getAttribute("emplist");
		for(EmployeeEntity e:list){
	%>
			<tr>
				<td><%= e.getEmpid() %></td>
				<td><%= e.getEmpname() %></td>
				<td><%= e.getJobrole() %></td>
				<td><%= e.getDept() %></td>
				<td><%= e.getDeptid() %></td>
				<td> <a href="updateemp?empid=<%=e.getEmpid()%>&name=<%= e.getEmpname()%>&jobrole=<%= e.getJobrole()%>&dept=<%=e.getDept()%>&deptid=<%=e.getDeptid()%>">Edit</a> / <a href="deleteemp?empid=<%=e.getEmpid()%>">Delete</a> </td>
			</tr>	
	<% } %>
			</table>
			<br>
			<br>
			<button><a href="insertform">Add Employee</a></button>
		</form>
</body>
</html>