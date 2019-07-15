package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookiesServlet
 */
public class CreateCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// create a cookie
		Cookie myNameCookie = new Cookie("myName", "Ashutosh");
		// send the above cookie to browser
		Cookie myLocationCookie = new Cookie("myLocation", "Bangalore");
		// send the above cookie to browser
		response.addCookie(myNameCookie);
		response.addCookie(myLocationCookie);
		myLocationCookie.setMaxAge(7 * 24 * 60 * 60);

		PrintWriter out = response.getWriter();
		out.print("Created the cookie");

	}// End of doGet()
}// End of class
