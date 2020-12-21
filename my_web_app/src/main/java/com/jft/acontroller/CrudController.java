package com.jft.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jft.bservice.IreadService;
import com.jft.domain.User;

@Controller //http://localhost:9090/springboot_thymeleaf/crud
public class CrudController {

	@Autowired
	private IreadService readService;

	@RequestMapping(value = "/crud", method = RequestMethod.GET)
	public String crud() {

		return "crud";

	}

	@RequestMapping(value = "/display-create-page", method = RequestMethod.GET)
	public String displayCreatePage() {

		return "create";

	}
	
	@RequestMapping(value = "/display-read-page", method = RequestMethod.GET)
	public String displayReadPage(Model model) {

		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}		
		
		return "read";

	}

	@RequestMapping(value = "/display-update-page", method = RequestMethod.GET)
	public String displayUpdatePage(Model model) {

		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}		
		
		return "update";

	}

	@RequestMapping(value = "/display-delete-page", method = RequestMethod.GET)
	public String displayDeletePage(User user, Model model) {

		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}		
		
		return "delete";

	}
	
	@RequestMapping(value = "/display-login-page", method = RequestMethod.GET)
	public ModelAndView login() {

		return new ModelAndView("login");

	}	

}