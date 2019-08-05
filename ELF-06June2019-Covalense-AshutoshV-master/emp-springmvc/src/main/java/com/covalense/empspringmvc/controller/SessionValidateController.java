package com.covalense.empspringmvc.controller;

import static com.covalense.empspringmvc.common.EMPConstants.VIEW_LOGINPAGE;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {

	@GetMapping("/validate/{url1}/{url2}")
	public String validateSession(HttpSession session, ModelMap modelMap, @Value("${msg}") String msg,
			@PathVariable("url1") String url1, @PathVariable("url2") String url2) {
		if (session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return VIEW_LOGINPAGE;
		} else {
			return "forward:/" + url1 + "/" + url2;
		}
	}

	@PostMapping("/validate")
	public String validateSessionForPost(HttpSession session, ModelMap modelMap, @Value("${msg}") String msg,
			@PathVariable("url1") String url1, @PathVariable("url2") String url2) {
		return validateSession(session, modelMap, msg, url1, url2);
	}

}