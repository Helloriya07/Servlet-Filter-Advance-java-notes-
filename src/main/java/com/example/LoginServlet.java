package com.example;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("uname");
	String password = request.getParameter("pass");
	
	HttpSession session = request.getSession(true);
	
	if(username!=null && password!= null) {
		if(username.equals("riya") && password.equals("1234")) {
			
			session.setAttribute("login", "ok");
			response.sendRedirect("/MyWebProject/Home.html");

		}
		else {
			response.sendRedirect("/MyWebProject/LoginPage.html");
		}
	}
	else {
		response.sendRedirect("/MyWebProject/LoginPage.html");
	}
	
	 
		
	}
}
