<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<form:form action="save" method="post" modelAttribute="registrationForm">
 <table>
		<tr>
		    <td>First Name</td>
		    <td>:</td>
		    <td> <form:input path="firstName" /></td>
		</tr>
		
		<tr>
		    <td>Last Name</td>
		    <td>:</td>
		    <td> <form:input path="lastName" /></td>
		</tr>
	
		<tr>
		    <td>Age</td>
		    <td>:</td>
		    <td> <form:input path="age" /></td>
		</tr>
		
		<tr>
		    <td>Address</td>
		    <td>:</td>
		    <td> <form:input path="address" /></td>
		</tr>
		
		<tr>
		    <td>Class:</td>
		    <td>:</td>
		    <td> <form:input path="stand" /></td>
		</tr>
		
	</table>
	<form:button>Submit</form:button>
</form:form>

</body>
</html>