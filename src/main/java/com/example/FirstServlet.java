package com.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/home")
public class FirstServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws  IOException, ServletException {
		String Fname = req.getParameter("fname");
		String Sname = req.getParameter("lname");
		String password = req.getParameter("pass");
		
		PrintWriter out = res.getWriter();
		if(Fname.equals("riya")&&(Sname.equals("shukla")) && password.equals("1234")) {
			out.print("You have sucessfully registered!!\n");
		}
		else {
			res.sendRedirect("/MyWebProject/index.html");
		}
	RequestDispatcher rd = req.getRequestDispatcher("/about");
	rd.include(req, res);
		
	}

}
