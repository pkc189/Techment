package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Largest
 */
@WebServlet("/Largest")
public class Largest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int n3 = Integer.parseInt(request.getParameter("n3"));
		
		PrintWriter out = response.getWriter();
		
		if(n1>n2 && n1>n3)
			out.print("Largest value is :"+n1);
		else if(n2>n1 && n2>n3)
			out.print("Largest value is :"+n2);
		else 
			out.print("Largest value is :"+n3);
		
		
	
	}

}
