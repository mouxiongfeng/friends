package com.friends.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.friends.service.Test;

@Controller
public class UserController {

	@Autowired
	private Test test;
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("test",test.test());
		return "hello";
	}
}
