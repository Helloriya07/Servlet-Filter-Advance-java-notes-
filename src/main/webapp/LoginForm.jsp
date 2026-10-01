<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form </title>
</head>
<body>

<% if(request.getMethod().equals("POST")){
String username = request.getParameter("uname");
String pass = request.getParameter("pass");
session = request.getSession(true);
if(username!=null && pass!=null){
if(username.equals("riya") && pass.equals("1234")){
session.setAttribute("login",true);
response.sendRedirect("/MyWebProject/HomePage.jsp");
}
else{
	
}
}

}%>

 <span style = color:red></span>
<form method = "POST">
<input type = "text" placeholder = "enter username" name = "uname"><br><br>
<input type = "password" placeholder = "enter password" name = "pass"><br><br>
<button>Login</button>
</form>


</body>
</html>