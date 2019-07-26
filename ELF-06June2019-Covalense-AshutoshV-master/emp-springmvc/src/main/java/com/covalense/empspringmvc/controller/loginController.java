package com.covalense.empspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.empspringmvc.dao.EmployeeDAO;
import com.covalense.empspringmvc.dao.EmployeeDAOFactory;
import com.covalense.empspringmvc.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/emp")
public class loginController {

	@GetMapping("/login")
	public String getLoginForm() {
		return "/loginFail";
	}

	@PostMapping("/authenticate")
	public String authenticate(EmployeeInfoBean infoBean, ModelMap modelMap) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(infoBean.getId());
		if (bean.getPassword().equals(infoBean.getPassword()) && bean.getId() == infoBean.getId()) {
			modelMap.addAttribute("infoBean", bean);
			return "login";

		} else {
			String msg = "Invalid ID or Password..Please login again";
			modelMap.addAttribute("msg", msg);
			return "/loginFail";
		}
	}

}
