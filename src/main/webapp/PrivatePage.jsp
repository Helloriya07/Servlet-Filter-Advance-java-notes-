<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Private page</title>
</head>
<body>
<%
boolean login = false;
if(session != null && session.getAttribute("login")!=null){
	login = (boolean)session.getAttribute("login");
}
if(!login){
	response.sendRedirect("/MyWebproject/LoginForm.jsp");
	
}
%>

<h2>This is private page</h2>
</body>
</html>