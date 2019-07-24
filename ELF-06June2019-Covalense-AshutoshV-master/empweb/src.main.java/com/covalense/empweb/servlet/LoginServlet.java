package com.covalense.empweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.empweb.beans.EmployeeInfoBean;
import com.covalense.empweb.dao.EmployeeDAO;
import com.covalense.empweb.dao.EmployeeDAOFactory;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getCookies() == null) {
			request.getRequestDispatcher("/loginFail?msg= make Cookies Enable First").include(request, response);
			return;
		}

		String idValue = request.getParameter("id");
		String passwordValue = request.getParameter("password");
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
		RequestDispatcher dispatcher = null;
		if (bean.getPassword().equals(passwordValue) && bean.getId() == Integer.parseInt(idValue)) {

			HttpSession session = request.getSession(true);
			session.setAttribute("data", bean);
			Cookie myCookie = new Cookie("JSESSIONID", session.getId());
			response.addCookie(myCookie);
			myCookie.setMaxAge(7 * 24 * 60 * 60);

			dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.include(request, response);

		} else {

			dispatcher = request.getRequestDispatcher("/loginFail?msg= Invalid username and password");
			dispatcher.include(request, response);

		}

	}
}
