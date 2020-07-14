package com.project.couriers.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.couriers.dto.ApiResponse;
import com.project.couriers.dto.LoginDto;
import com.project.couriers.dto.SignUpDto;
import  com.project.couriers.model.Customer;
import com.project.couriers.service.CustomerService;
import com.project.couriers.service.CustomerServiceInt;
import com.project.couriers.service.UserService;
@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceInt CustomerServiceInt;
	//private Customer customer;
	
	
	 @RequestMapping(value = "/customerlogin", method = RequestMethod.GET)
		public String getLogin(Model model) {
			model.addAttribute("Customer", new Customer());
			return "customerlogin";
		}

		@RequestMapping(value = "/customerpage", method = RequestMethod.POST)
		public String login(@ModelAttribute("user") Customer user) {

			final boolean isValid = CustomerServiceInt.login(user);
			if (isValid) {
				return "customerfrontpage";
			}

			return "redirect:/home";
		}

/*	@RequestMapping("/customer")
	public String userpage(String name, String pasd,HttpServletRequest request, HttpSession session,HttpServletResponse response) {
			
		String username=name;
		String password=pasd;
			try {
				
				//usr.setUsrPasswrod(hashPassword(usr.getUsrPasswrod()));
				Customer loginUsr=Customer.findByName(username, password);
				if(loginUsr==null) {
					System.out.println("Invalid User name / password");
					map.addAttribute("error", "Invalid User name / password");
					return "logincustomer";
				}			
				else
				{
		           return "customerfrontpage";
	
			}
			}
	}
	
*/	
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
	@RequestMapping("/billing")
	public String billing(){
		return "billing";
	}
	@RequestMapping("/customerdetails")
	public String customerdetails(){
		logger.debug("customerdetails()");
		model.addAttribute("customers",customerrService.findAll());
		return "customerdetails";
	} 
	
}
