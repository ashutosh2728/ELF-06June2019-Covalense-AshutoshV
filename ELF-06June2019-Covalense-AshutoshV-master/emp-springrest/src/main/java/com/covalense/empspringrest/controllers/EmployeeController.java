package com.covalense.empspringrest.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.covalense.empspringrest.dao.EmployeeDAO;
import com.covalense.empspringrest.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of InitBinder

	@DeleteMapping(path = "/deleteEmployee")
	public @ResponseBody boolean deleteEmployee(@RequestParam("id") int id) {
		return dao.deleteEmployeeInfoBean(id);
	}

	@PostMapping(path = "/createEmployee")
	public @ResponseBody boolean createEmployee(@RequestBody EmployeeInfoBean bean) {
		return dao.createEmployeeInfo(bean);
	}

	@PutMapping(path = "/updateEmployee")
	public boolean updateEmployee(@RequestBody EmployeeInfoBean bean) {
		return dao.updateEmployeeInfo(bean);
	}

	@GetMapping(path = "/getEmployee")
	public @ResponseBody EmployeeInfoBean getEmployee(@RequestParam("id") int id) {
		return dao.getEmployeeInfo(id);
	}

	@GetMapping(path = "/getAllEmployee")
	public @ResponseBody List<EmployeeInfoBean> getAllEmployee(int id) {
		return dao.getAllEmployeeInfo(id);
	}
}
