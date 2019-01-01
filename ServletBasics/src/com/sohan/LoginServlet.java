package com.sohan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		out.println("Hello"+username);
		String password=request.getParameter("password");
		HttpSession session =request.getSession();
		if(password.length()>3 && password.contentEquals("sohan"))
		{
//			out.println("Password is correct");
//			response.sendRedirect("success.html");
			session.setAttribute("name",username);
		}
//		else
//		{
//			out.println("Please enter correct password");
//			 response.sendRedirect("failed.html");
//				
//		}
		out.println("Name is "+username);
		out.println("Session object is "+(String) session.getAttribute("name"));
	}

}
