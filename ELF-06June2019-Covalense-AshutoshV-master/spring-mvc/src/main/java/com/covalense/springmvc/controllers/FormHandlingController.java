package com.covalense.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.springmvc.beans.UserBean;

@Controller
@RequestMapping("/forms")
public class FormHandlingController {
	@GetMapping("/getForm")
	public String getForm() {
		return "form";
	}

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {

		int userId = Integer.parseInt(req.getParameter("userId"));
		String pwd = req.getParameter("password");

		req.setAttribute("userId", userId);
		req.setAttribute("password", pwd);
		return "formDataDisplay";
	}

	@PostMapping("/formSubmit2")
	public String submitForm(int userId, String password, ModelMap modelMap) {
		modelMap.addAttribute("userID", userId);
		modelMap.addAttribute("password", password);
		return "formDataDisplay";
	}

	@PostMapping("/formSubmit3")
	public String submitForm3(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formDataBeanDisplay";

	}

	@PostMapping("/formSubmit4")
	public String submitForm4(@RequestParam(name = "userId") int uId, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userId", uId);
		modelMap.addAttribute("password", pwd);
		return "formDataDisplay";
	}

	@PostMapping("/formSubmit5")
	public String submitForm5(@RequestParam(name = "userId") int uId, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userId", uId);
		modelMap.addAttribute("password", pwd);
		return "formDataDisplayEL";

	}

	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formDataBeanDisplayEL";

	}

}// End of class
