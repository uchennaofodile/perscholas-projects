package com.perscholas.modelandview.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.perscholas.modelandview.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
public class ModelAndViewController {
	@GetMapping("/showViewPage")
	public String passParametersWithModel(Model model) {
		model.addAttribute("message", "Perscholas");//first string is variable name //second is the value
		model.addAttribute("welcomeMessage", "Welcome");//similar to handlebars how you have partials
		int i = 10;
		model.addAttribute("number", i);
		List<String> list = Arrays.asList("one", "two");
		model.addAttribute("listData", list);
		return "viewPage";//html page
		}
	@GetMapping("/goToViewPage")
	public ModelAndView passParametersWithModelAndView() {
	String st = "Welcome to the Page";
	ModelAndView modelAndView = new ModelAndView("viewPage_2");
	modelAndView.addObject("message", st);
	modelAndView.addObject("info", "Employee information:");
	return modelAndView; //object
	}
	
	@GetMapping("/goToUserViewPage")
	public ModelAndView UserModelAndView() {
	List<User> listUsers = new ArrayList<User>();
	listUsers.add(new User(1,"Haseeb","haseeb@abc.com,"));
	listUsers.add(new User(2,"Shahparan","Shahparan@abc.com,"));
	listUsers.add(new User(3,"James","James@abc.com,"));
	listUsers.add(new User(4,"Joseph","Joseph@abc.com,"));
	ModelAndView modelAndView = new ModelAndView("userdata");
	modelAndView.addObject("userlist", listUsers);
	return modelAndView;
	}
}
