package com.jft.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jft.bservice.IreadService;
import com.jft.bservice.IupdateService;
import com.jft.domain.User;

@Controller
public class UpdateController {

	@Autowired
	private IupdateService updateService;

	@Autowired
	private IreadService readService;

	@RequestMapping(value = "/update-rec", method = RequestMethod.GET)
	public String update(User user, Model model) {

		updateService.updateUser(user);

		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}		
		
		return "update";		

	}	

}