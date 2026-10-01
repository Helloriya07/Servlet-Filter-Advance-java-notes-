package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/about")
public class AboutSevelt extends HttpServlet {
	
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String Fname = req.getParameter("fname");
		String Sname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phoneNumber =req.getParameter("phone");
		String password = req.getParameter("pass");
		
	 PrintWriter out = res.getWriter();
	 out.println("Details.....\n Name = "+Fname +" "+Sname+"\n Email ="+email +"\n Mobile number ="+phoneNumber);
		

}
}
