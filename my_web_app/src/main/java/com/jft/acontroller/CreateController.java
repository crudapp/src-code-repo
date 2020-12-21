package com.jft.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jft.bservice.IcreateService;
import com.jft.bservice.IreadService;
import com.jft.domain.User;

@Controller
public class CreateController {
	
	@Autowired
	private IcreateService createService;	

	@Autowired
	private IreadService readService;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(User user, Model model) {

		createService.createUser(user);

		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}		
		
		return "redirect:/display-update-page";

	}

}