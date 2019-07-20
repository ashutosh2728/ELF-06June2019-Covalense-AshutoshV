package com.covalense.empweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.empweb.beans.EmployeeInfoBean;
import com.covalense.empweb.dao.EmployeeDAO;
import com.covalense.empweb.dao.EmployeeDAOFactory;

/**
 * Servlet implementation class GetEmpInfoServlet
 */
public class GetEmpInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idValue = request.getParameter("eid");
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		if (session == null) {
			out.print("<h1><span style = 'color : red'>Invalid session !!! Please login!!!</h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}
		// invalid session ; Generate login page with error msg }
		else {
			// Valid credentials; Create a session

			out.print(" <!DOCTYPE html>    ");
			out.print(" <html lang=\"en\">  ");
			out.print(" <head> ");
			out.print(" <meta charset=\"UTF-8\"> ");
			out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.print("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"> ");
			out.print("<link rel=\"stylesheet\" href=\"bootstrap-4.3.1/dist/css/bootstrap.css\">");
			out.print(
					"<link rel=\"stylesheet\" href=\"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">  ");
			out.print("     <title>Document</title> ");
			out.print(" </head>  ");
			out.print(" <body>   ");
			out.print(" <nav class=\"navbar navbar-expand-sm navbar-dark bg-dark\" > ");
			out.print("<div>");
			out.print(
					" <a href = \" ./profile\"> <img src=\"https://cdn.pixabay.com/photo/2019/07/15/12/02/portrait-4339180__340.jpg\" alt=\"\" width=\"150\" height=\"150\">   ");
			out.print("</a>");
			out.print("  </div>  ");
			out.print(" <div> ");

			out.print("<form class=\"example\" action=\"./search\" method=\"get\">");
			out.print("<input type=\"text\" placeholder=\"Search..\" name=\"search\">");
			out.print("<button type=\"submit\"><i class=\"fa fa-search\"></i></button>");
			out.print("</form>");

			out.print("</div> ");
			out.print("         <div>  ");
			out.print("<a class=\"btn btn-primary\"  href='./logout'>Log out</a> ");
			out.print(" </div>  ");
			out.print(" </nav>  ");
			out.print("<BR> Name ===> " + bean.getName());
			out.print("<BR> Id ===>" + bean.getId());
			out.print("<BR>  Age ===>" + bean.getAge());
			out.print("<BR>  GENDER ===>" + bean.getGender());
			out.print("<BR> SALARY ===>" + bean.getSalary());
			out.print("<BR> PHONE ===>" + bean.getPhone());
			out.print("<BR> JOINING_DATE ===>" + bean.getJoiningDate());
			out.print("<BR> ACCOUNT_NUMBER ===>" + bean.getAccountNumber());
			out.print("<BR> EMAIL ===>" + bean.getEmail());
			out.print("<BR> DESIGNATION ===>" + bean.getDesignation());
			out.print("<BR> DOB ===>" + bean.getDob());
			out.print("<BR> DEPT_ID ===>" + bean.getDepartmentId());
			out.print("<BR> MNGR_ID ===>" + bean.getManagerId());
			out.print("    <script src=\"homepage.js\"></script>)");
			out.print("");
			out.print(
					"     <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script> ");
			out.print(
					" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script> ");
			out.print(
					" <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script> ");
			out.print(" </body>");
			out.print(" </html>");
		}

	}

}
