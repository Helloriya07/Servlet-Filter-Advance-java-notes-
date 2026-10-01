package com.examplee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/logoutt")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
HttpSession session = request.getSession(false);
		
		if(session != null & (boolean)session.getAttribute("login")==true) {
			session.removeAttribute("login");
			session.invalidate();
			response.sendRedirect("/MyWebProject/Home.html");
		}
	}



}
