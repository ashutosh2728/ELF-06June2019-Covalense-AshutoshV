package com.covalense.mywebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

/**
 * Servlet implementation class ForwardServlet
 */
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setId(1234);
		employeeInfoBean.setName("Aashu");
		employeeInfoBean.setEmail("aashu@gmail.com");
		employeeInfoBean.setPhone(12313636);

		// Pass the above object employeeSearchServlet
		// request.setAttribute("info", employeeInfoBean);
		ServletContext context = getServletContext();
		context.setAttribute("info", employeeInfoBean);

		// String url = "http://www.google.com";
		String url = "search?id=102";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
