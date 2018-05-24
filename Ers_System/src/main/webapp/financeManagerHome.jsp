<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h1>Finance Manager Home</h1>
	<%@ page import="com.revature.model.Employee" %>
	<% Employee employee = (Employee) request.getSession().getAttribute("authorizedUser"); %>
	
			
	<div>
		<ul>
			<li> <a href="ViewEmpReimbursement.jsp" > view all Reimbursement</a> </li>
			<li> <a href="viewAllEmployee.jsp"> View all employee</a> </li>
			<li> <a href="updateInfo.jsp"> View all reimbursements</a> </li>
		 	<li> <a href="singleReimbursement"> view single Reimbursement </a> </li>
		 	<li> <a href="logOut.jsp"> Click here to logout</a> </li>
		
		</ul>
	</div>
	

			
			
			
			
		
			
			
</body>
</html>