package com.jft.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jft.bservice.IdeleteService;
import com.jft.bservice.IreadService;
import com.jft.domain.User;

@Controller
public class DeleteController {

	@Autowired
	private IdeleteService deleteService;

	@Autowired
	private IreadService readService;

	@RequestMapping(value = "/delete-rec", method = RequestMethod.GET)
	public String deleteById(User user, Model model) {

		deleteService.deleteUserById(user);

		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}
		
		return "delete";

	}

	@RequestMapping(value = "/delete-all", method = RequestMethod.GET)
	public String deleteAll(User user, Model model) {
		
		deleteService.deleteAll();
		
		List<User> userList = readService.findAllUser();
		
		if (null != userList) {
			model.addAttribute("userList", userList);
		}
		
		return "delete";		

	}	

}