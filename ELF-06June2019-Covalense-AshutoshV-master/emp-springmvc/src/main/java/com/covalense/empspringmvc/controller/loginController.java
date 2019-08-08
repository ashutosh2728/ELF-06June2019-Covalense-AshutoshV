package com.covalense.empspringmvc.controller;

import static com.covalense.empspringmvc.common.EMPConstants.PROPERTY_FILE;
import static com.covalense.empspringmvc.common.EMPConstants.VIEW_HOMEPAGE;
import static com.covalense.empspringmvc.common.EMPConstants.VIEW_LOGINPAGE;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.empspringmvc.dao.EmployeeDAO;
import com.covalense.empspringmvc.dto.EmployeeInfoBean;
import com.covalense.empspringmvc.dto.EmployeeOtherInfoBean;

@Controller
@PropertySource(PROPERTY_FILE)
@RequestMapping("/login")
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}// End of InitBinder

	@GetMapping("/loginPage")
	public String getLoginForm() {
		return VIEW_LOGINPAGE;
	}// End of loginPage

	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest request,
			@Value("${invalidLogin}") String invalidLogin) {

		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeOtherInfoBean otherInfoBean = dao.getEmployeeOtherInfo(id);
		if (bean.getPassword().equals(password) && bean.getId() == id) {
			HttpSession session = request.getSession(true);
			session.setAttribute("infoBean", bean);
			session.setAttribute("otherInfoBean", otherInfoBean);
			return VIEW_HOMEPAGE;

		} else {
			request.setAttribute("msg", invalidLogin);
			return VIEW_LOGINPAGE;
		}
	}// End of authenticate

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap, @Value("${logoutMsg}") String msg) {
		modelMap.addAttribute("msg", msg);
		session.invalidate();
		return VIEW_LOGINPAGE;
	}// End of logout
}// End of LoginController
