package com.covalense.empspringrest.controllers;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
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
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspringrest.dao.EmployeeDAO;
import com.covalense.empspringrest.dto.EmployeeAddressInfoBean;
import com.covalense.empspringrest.dto.EmployeeEducationalInfoBean;
import com.covalense.empspringrest.dto.EmployeeExperienceInfoBean;
import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeOtherInfoBean;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of InitBinder

	@DeleteMapping(path = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody EmployeeResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (dao.deleteEmployeeInfoBean(id)) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee Data deleted successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee Data not deleted successfully");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
	}

	@PostMapping(path = "/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean infoBean) {
		List<EmployeeEducationalInfoBean> eduBeans = infoBean.getEmployeeEducationalInfoBean();
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : eduBeans) {
			employeeEducationalInfoBean.getEducationalInfoPKBean().setBean(infoBean);
		}

		List<EmployeeAddressInfoBean> addressInfoBeans = infoBean.getAddressInfoBeanList();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			employeeAddressInfoBean.getAddressPKBean().setBean(infoBean);
		}

		List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans = infoBean.getEmployeeExperienceInfoBean();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : employeeExperienceInfoBeans) {
			employeeExperienceInfoBean.getEmployeeExperienceInfoPKBean().setBean(infoBean);
		}

		EmployeeOtherInfoBean otherInfoBean = infoBean.getOtherInfo();
		otherInfoBean.setInfoBean(infoBean);
		EmployeeResponse response = new EmployeeResponse();
		if (dao.createEmployeeInfo(infoBean)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee Data inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee Data not inserted successfully");
		}
		return response;
	}

	/*
	 * @PostMapping(path = "/createEmployee") public @ResponseBody boolean
	 * createEmployee(@RequestBody EmployeeInfoBean bean) { return
	 * dao.createEmployeeInfo(bean); }
	 */

	@PutMapping(path = "/updateEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean infoBean, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeEducationalInfoBean> eduBeans = infoBean.getEmployeeEducationalInfoBean();
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : eduBeans) {
			employeeEducationalInfoBean.getEducationalInfoPKBean().setBean(infoBean);
		}

		List<EmployeeAddressInfoBean> addressInfoBeans = infoBean.getAddressInfoBeanList();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			employeeAddressInfoBean.getAddressPKBean().setBean(infoBean);
		}

		List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans = infoBean.getEmployeeExperienceInfoBean();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : employeeExperienceInfoBeans) {
			employeeExperienceInfoBean.getEmployeeExperienceInfoPKBean().setBean(infoBean);
		}

		EmployeeOtherInfoBean otherInfoBean = infoBean.getOtherInfo();
		if (request.getSession(false) != null) {
			if (dao.updateEmployeeInfo(infoBean)) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee Data updated successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee Data not updated successfully");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
	}

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee data found successfully");
				response.setBeans(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee data not found");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
	}

	@GetMapping(path = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(@RequestParam("id") int id, HttpServletRequest request) {

		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (beans != null) {
				response.setStatusCode(201);
				response.setMessage("Successful");
				response.setDescription("Employee data found successfully");
				response.setBeans(beans);
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Employee data not found");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDescription("Please login first");
			return response;
		}
	}
}
