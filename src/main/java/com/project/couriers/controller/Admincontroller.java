package com.project.couriers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import  com.project.couriers.model.Admin;
import com.project.couriers.model.User;

@RestController
public class Admincontroller {
	
	@Autowired
	private AdminServiceInt AdminServiceInt;
	
	@RequestMapping("/adminpage")
	public String adminpage(){
		return "adminfrontpage";
	}  
	@RequestMapping("/admin")
	public String admin(){
		return "loginadmin";
		
	}   

	@RequestMapping(value = "/adminpage", method = RequestMethod.GET)
	public String getLogin(Model model) {
		model.addAttribute("admin", new Admin());
		return "adminpage";
	}

	@RequestMapping(value = "/adminpage", method = RequestMethod.POST)
	public String login(@ModelAttribute("admin") Admin user) {

		final boolean isValid = AdminServiceInt.login(user);
		if (isValid) {
			return "adminrfrontpage";
		}

		return "redirect:/adminlogin";
	@RequestMapping("/parceldistribution")
	public String parceldistribution(){
		return "parceldistribution";
	} 
	@RequestMapping("/history")
	public String history(){
		return "history";
	} 
	@RequestMapping("/optimumroute")
	public String optimumroute(){
		return "route";
	} 
	@RequestMapping("/report")
	public String report(){
		return "report";
	} 
}
