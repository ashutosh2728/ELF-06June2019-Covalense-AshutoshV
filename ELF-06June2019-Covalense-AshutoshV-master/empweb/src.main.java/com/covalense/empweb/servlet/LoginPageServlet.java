package com.covalense.empweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginPageServlet
 */
public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie dummyCookie = new Cookie("JSESSIONID", "CheckCookiesEnabled");
		response.addCookie(dummyCookie);

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if (session == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("EMP/emp.html");
			dispatcher.include(request, response);
		}
		// invalid session ; Generate login page with error msg }
		else {

			RequestDispatcher dispatcher = request.getRequestDispatcher("./login");
			dispatcher.forward(request, response);
		}

	}

}
