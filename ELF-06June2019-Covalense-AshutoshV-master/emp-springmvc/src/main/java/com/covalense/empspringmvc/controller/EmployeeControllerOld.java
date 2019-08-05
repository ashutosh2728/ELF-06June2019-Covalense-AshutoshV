package com.covalense.empspringmvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.empspringmvc.dao.EmployeeDAO;
import com.covalense.empspringmvc.dao.EmployeeDAOFactoryOld;
import com.covalense.empspringmvc.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeControllerOld {
	/*
	 * @RequestMapping(path = "/getMessage", method = RequestMethod.GET) public
	 * ModelAndView getMessage() { ModelAndView modelAndView = new ModelAndView();
	 * // modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
	 * modelAndView.setViewName("messagePage"); return modelAndView; }
	 * 
	 * @GetMapping("/setMessage") public ModelAndView getMessage(ModelAndView
	 * modelAndView) { modelAndView.setViewName("messagePage"); return modelAndView;
	 * }
	 */
	@GetMapping("/empLogin")
	public String login(EmployeeInfoBean infoBean, ModelMap modelMap,
			@Value("${dbInteractionType}") String dbInteractionType) {
		EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(infoBean.getId());

		if (bean.getPassword().equals(infoBean.getPassword())
				&& bean.getId() == Integer.parseInt(infoBean.getPassword())) {
			return "login";

		} else {

			return "";
		}
	}

}
