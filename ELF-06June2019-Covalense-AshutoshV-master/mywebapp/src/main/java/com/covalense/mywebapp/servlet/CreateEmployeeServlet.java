package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/create")
public class CreateEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EmployeeInfoBean bean = new EmployeeInfoBean();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

		try {
			bean.setId(Integer.parseInt(req.getParameter("id")));
			bean.setName(req.getParameter("name"));
			bean.setAge(Integer.parseInt(req.getParameter("age")));
			bean.setGender(req.getParameter("gender"));
			bean.setSalary(Double.parseDouble(req.getParameter("salary")));
			bean.setPhone(Integer.parseInt(req.getParameter("phone")));
			bean.setEmail(req.getParameter("email"));
			bean.setDesignation(req.getParameter("designation"));
			bean.setAccountNumber(Integer.parseInt(req.getParameter("accountNumber")));
			bean.setDob(dateFormat.parse(req.getParameter("dob")));
			bean.setJoiningDate(dateFormat.parse(req.getParameter("joiningDate")));
			bean.setDepartmentId(Integer.parseInt(req.getParameter("departmentId")));
			bean.setManagerId(Integer.parseInt(req.getParameter("managerId")));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean result = dao.createEmployeeInfo(bean);
		PrintWriter out = resp.getWriter();
		if (result) {
			out.print("Employee inserted");
		} else {
			out.print("Employee not  inserted");
		}

	}
}
