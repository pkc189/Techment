package com.techment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		int age = Integer.parseInt(req.getParameter("age"));

		if (age >= 18) {
			RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
			rd.forward(req, resp);
		} else {
			out.print("you can't");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}

	}
}
