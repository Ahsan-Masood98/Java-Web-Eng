<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week3Lab</title>
</head>
<body>
	<h2>From Servlet to JSP</h2>
	<h2>Name: ${name}</h2>
	<h2>Class: ${course}</h2>
	<h2>From JSP to Servlet</h2>
	<h3>Registration Form</h3>
	<form action="helloworld" method ="post">
	<label>Name</label><br/>
	<input type=text name="name" placeholder="Enter Name"/><br/>
	<label>Username</label><br/>
	<input type=text name="username" placeholder="Enter Username"/><br/>
	<label>Password</label><br/>
	<input type=password name="password" placeholder="Enter Password"/><br/>
	<button type="submit">Submit</button>
	</form>
</body>
</html>