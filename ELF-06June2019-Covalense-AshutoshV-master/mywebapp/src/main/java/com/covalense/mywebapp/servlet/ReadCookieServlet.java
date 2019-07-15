package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookieServlet
 */
public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] receivedCookies = request.getCookies();
		PrintWriter out = response.getWriter();
		if (receivedCookies == null) {
			out.print("Cookies are not present...");
		} else {
			out.print("Cookies are present...");
		}

		for (Cookie rcvdCookie : receivedCookies) {
			out.print("Cookie Name : " + rcvdCookie.getName());
			out.print("Cookie Value : " + rcvdCookie.getValue());
		}
	}

}
