package com.covalense.empapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.empapp.beans.EmployeeInfoBean;
import com.covalense.empapp.dao.EmployeeDAO;
import com.covalense.empapp.dao.EmployeeDAOFactory;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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

			String idValue = request.getParameter("search");
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			List<EmployeeInfoBean> bean = dao.getAllEmployeeInfo(idValue);

			out.print(" <!DOCTYPE html>    ");
			out.print(" <html lang=\"en\">  ");
			out.print(" <head> ");
			out.print("     <meta charset=\"UTF-8\"> ");
			out.print("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.print("     <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"> ");
			out.print("     <link rel=\"stylesheet\" href=\"bootstrap-4.3.1/dist/css/bootstrap.css\">");
			out.print(
					"     <link rel=\"stylesheet\" href=\"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">  ");
			out.print("     <title>Document</title> ");
			out.print(" </head>  ");
			out.print(" <body>   ");
			out.print("     <nav class=\"navbar navbar-expand-sm navbar-dark bg-dark\" > ");
			out.print("         <div>   ");
			out.print(
					"             <img src=\"https://cdn.pixabay.com/photo/2019/07/15/12/02/portrait-4339180__340.jpg\" alt=\"\" width=\"150\" height=\"150\">   ");
			out.print("         </div>  ");
			out.print("        <div> ");

			out.print("<form class=\"example\" >");
			out.print("<input type=\"text\" placeholder=\"Search..\" name=\"search\">");
			out.print("<button type=\"submit\"><i class=\"fa fa-search\"></i></button>");
			out.print("</form>");

			out.print("         </div> ");
			out.print("         <div>  ");
			out.print("<a class=\"btn btn-primary\"  href='./logout'>Log out</a> ");
			out.print(" </div>  ");
			out.print(" </nav>  ");
			out.print("<table>                      ");
			out.print("  <tr>                       ");
			out.print("    <td>Employee ID</td>     ");
			out.print("      <td>Employee Name</td> ");
			out.print("    </tr>                    ");
			for (EmployeeInfoBean empBean : bean) {

				out.print("  <tr>                       ");
				out.print("    <td>" + empBean.getId());
				out.print("<a href=\"./getinfo" + "></a>");
				out.print("</td> ");
				out.print("<td>" + empBean.getName() + "</td> ");
				out.print("    </tr>                    ");
			}
			out.print("</table>						");

			out.print("    <script src=\"homepage.js\"></script>");
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
