<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ahsan.entity.user_details"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DATA from DB</title>
</head>
<body>
	<%
	List<user_details> list = new ArrayList<>();
	list = (List) request.getAttribute("list_of_users");
	for (int i = 0; i < list.size(); i++) {
		out.println(list.get(i).toString());
		out.println("</br>");

	}
	%>
</body>
</html>