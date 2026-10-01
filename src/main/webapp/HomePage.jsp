<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>

<% boolean var = false;
if(session != null && session.getAttribute("login")!=null){
	var = (boolean)session.getAttribute("login");
}
%>

<% if(var){ %>

	      <a href="/MyWebProject/Jsplogout">Logout</a>	 
	      <a href="/MyWebProject/PrivatePage.jsp">Second page</a><br/>
	      

<%} else{ %>
              <a href="/MyWebProject/LoginForm.jsp">Login</a><br/>
              
<%} %>





</body>
</html>