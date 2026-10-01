package com.examplee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/loginn")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		HttpSession session = request.getSession(true);
		if(username != null && password != null) {
			if(username.equals("riya")&& password.equals("1234")) {
				session.setAttribute("login", true);
				response.sendRedirect("/MyWebProject/this.html");
				
				
			}
			else {
				response.sendRedirect("/MyWebProject/filterDemo.html");
			}
		}
		else {
			response.sendRedirect("/MyWebProject/filterDemo.html");
		}

}
}
