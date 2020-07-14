package com.project.couriers.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import  com.project.couriers.model.User;
import  com.project.couriers.service.UserService;
@RestController
public class SystemuserController {
	@Autowired
	private UserServiceInt UserServiceInt;
	
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String getLogin(Model model) {
			model.addAttribute("user", new User());
			return "userpage";
		}

		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String login(@ModelAttribute("user") User user) {

			final boolean isValid = UserService.login(user);
			if (isValid) {
				return "userfrontpage";
			}

			return "redirect:/login";
	@RequestMapping("/user")
	public String user(){
		return "login";
	}  
	@RequestMapping("/courierlist")
	public String courierlist(){
		
	
		return "list";
	}  
	@RequestMapping("/edit")
	public String edit(){
		return "edits";
	}  
	@RequestMapping("/tracking")
	public String tracking(){
		return "tracking";
	}  
	@RequestMapping("/payment")
	public String payment(){
		return "payment";
	} 
	@RequestMapping("/history")
	public String history(){
		return "history";
	} 
	
	@RequestMapping("/userdetails")
	public String userdetails(){
		logger.debug("userdetails()");
		model.addAttribute("users", userService.findAll());
		return "userdetails";
	} 
	
}
