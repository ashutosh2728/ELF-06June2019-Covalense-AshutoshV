package com.covalense.empspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session")
public class SessionController {

	@GetMapping("/login")
	public String login() {
		return "/loginForm";
	}// End of login
	/*
	 * @PostMapping("/login") public String authenticate(UserBean
	 * userBean,HttpServletRequest req) { if(userBean.getUserId()==101 &&
	 * userBean.getPassword().equals("aashu") { HttpSession session =
	 * req.getSession(true); return ""; } }// End of authenticate
	 */
}// End of session Controller
