package com.examplee;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebFilter("/private")
public class Filter extends HttpFilter implements jakarta.servlet.Filter {
       
   
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		HttpSession session = request.getSession(false);
		if(session!=null && session.getAttribute("login")!=null) {
			if((boolean)session.getAttribute("login")==true){
				chain.doFilter(request, response);
			}
		}
		else {
			response.sendRedirect("/MyWebProject/Home.html");;
		}
		

	

}
}
