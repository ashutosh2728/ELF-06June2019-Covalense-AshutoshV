package com.covalense.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.empspringmvc.dao.EmployeeDAO;
import com.covalense.empspringmvc.dao.EmployeeDAOFactoryOld;
import com.covalense.empspringmvc.dto.EmployeeAddressInfoBean;
import com.covalense.empspringmvc.dto.EmployeeEducationalInfoBean;
import com.covalense.empspringmvc.dto.EmployeeExperienceInfoBean;
import com.covalense.empspringmvc.dto.EmployeeInfoBean;
import com.covalense.empspringmvc.dto.EmployeeOtherInfoBean;

@Controller
@RequestMapping("/emp")
@PropertySource("classpath:emp.properties")
public class FirstController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/login")
	public String getLoginForm() {
		return "/loginPage";
	}

	@PostMapping("/authenticate")
	public String authenticate(EmployeeInfoBean infoBean, HttpServletRequest request, ModelMap modelMap,
			@Value("${dbInteractionType}") String dbInteractionType) {
		EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(infoBean.getId());
		EmployeeOtherInfoBean otherInfoBean = dao.getEmployeeOtherInfo(infoBean.getId());
		if (bean.getPassword().equals(infoBean.getPassword()) && bean.getId() == infoBean.getId()) {
			HttpSession session = request.getSession(true);
			modelMap.addAttribute("infoBean", bean);
			modelMap.addAttribute("otherInfoBean", otherInfoBean);
			return "/login";

		} else {
			modelMap.addAttribute("msg", "Invalid ID or Password..Please login again");
			return "/loginPage";
		}
	}

	@GetMapping("/homepage")
	public String getHomePage() {
		return "/login";
	}

	@GetMapping("/searchEmp")
	public String searchEmployee() {
		return "search";
	}

	@PostMapping("/searchEmp")
	public String searchEmployee(EmployeeInfoBean infoBean, ModelMap modelMap, HttpServletRequest request,
			@Value("${dbInteractionType}") String dbInteractionType) {

		HttpSession session = request.getSession(false);
		if (session == null) {
			return "/login";
		}

		else {
			EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
			List<EmployeeInfoBean> bean = dao.getAllEmployeeInfo(infoBean.getId());
			modelMap.addAttribute("infoBean", infoBean);
			modelMap.addAttribute("bean", bean);
			return "/search";
		}

	}

	@GetMapping("/create")
	public String getCreateForm() {
		return "/createEmp";
	}

	@PostMapping("/createEmployee")
	public String createEmployee(EmployeeInfoBean infoBean, ModelMap map) {

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
		System.out.println(dao + "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		boolean result = dao.createEmployeeInfo(infoBean);

		if (result) {
			map.addAttribute("msg", "Employee added successfully");
		} else {
			map.addAttribute("msg", "Employee added successfully");

		}
		return "/loginPage";

	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		modelMap.addAttribute("msg", "Successfully logout..Thanks for visiting..");
		session.invalidate();
		return "/loginPage";
	}

	@GetMapping("/validate")
	public String validateSession(HttpSession session, ModelMap modelMap, @RequestParam("url") String url,
			@Value("${msg}") String msg) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return "/loginPage";
		} else {
			return url;
		}
	}

	@GetMapping("/validate2")
	public String validateSession2(HttpServletRequest request, ModelMap modelMap, @RequestParam("url") String url) {
		if (request.getSession(false) == null) {
			modelMap.addAttribute("msg", "Please login again...");
			return "/loginPage";
		} else {
			return url;
		}
	}

	@GetMapping("/validate3/{url}")
	public String validateSession3(HttpSession session, ModelMap modelMap, @PathVariable("url") String url,
			@Value("${msg}") String msg) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return "/loginPage";
		} else {
			return "forward:/emp/" + url;
		}
	}

	@PostMapping("/validate")
	public String validateSessionForPost(HttpSession session, ModelMap modelMap, @RequestParam("url") String url,
			@Value("${msg}") String msg) {
		return validateSession(session, modelMap, url, msg);
	}

	@GetMapping("/updateEmployee")
	public String getUpdateEmployee() {
		return "updateEmployee";
	}

	@PostMapping("/updateEmployee")
	public String updateEmployee(EmployeeInfoBean infoBean, int mngId) {
		EmployeeInfoBean mngBean = dao.getEmployeeInfo(mngId);
		infoBean.setMngId(mngBean);
		dao.updateEmployeeInfo(infoBean);
		return "homePage";
	}
}
