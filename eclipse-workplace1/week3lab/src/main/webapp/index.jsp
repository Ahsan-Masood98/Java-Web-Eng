<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ahsan.entity.user_details"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD</title>
</head>
<body>
	<form action="LoginFormController" method="get">
		<label for="action">Choose an Action:</label> 
		<select name="action" id="action">
			<option value="get">GET</option>
			<option value="add">ADD</option>
			<option value="update">UPDATE</option>
			<option value="delete">DELETE</option>
		</select><br>
		<label>Username</label><br>
		<input type="text" name="username" placeholder="Enter Username"><br>
		<label>Email</label><br> 
		<input type="text" name="email"placeholder="Enter Email"><br> 
		<label>Password</label><br>
		<input type="password" name="password" placeholder="Enter Password"><br>
		
		<h3>For Update and Delete</h3>
		<label for="action">Choose an Column:</label> 
		<select name="column_name" id="column_name">
			<option value="username">Username</option>
			<option value="email">Email</option>
			<option value="password">Password</option>
		</select><br/>
		<label>Updated Data</label><br> 
		<input type="text" name="updatedData"placeholder="Enter Data to Update"><br> 
		<label>ID to Delete or Update</label><br>
		<input type="text" name="id" placeholder="Enter ID"><br>
		<button type="submit">Submit</button>
		
	</form>
</body>
</html>