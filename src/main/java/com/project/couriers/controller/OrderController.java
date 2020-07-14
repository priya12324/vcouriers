package com.project.couriers.controller;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import  com.project.couriers.model.Order;
import com.project.couriers.service.OrderServicesInt;
@RestController
public class OrderController {
	@Autowired
	private OrderServicesInt OrderServicesInt;
	

	private final Logger logger = LoggerFactory.getLogger(OrderController.class);

	

	// list page
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public String showAllOrders(Model model) {

		logger.debug("showAllOrders()");
		model.addAttribute("orders",orderServicesInt.findAll());
		return "orders";

	}

	// save or update user
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("orderForm") @Validated Order order,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

		logger.debug("saveOrUpdateOrder() : {}", order);

		if (result.hasErrors()) {
			populateDefaultModel(model);
			return "orders";
		} else {

			redirectAttributes.addFlashAttribute("css", "success");
			if(order.isNew()){
				redirectAttributes.addFlashAttribute("msg", "Order added successfully!");
			}else{
				redirectAttributes.addFlashAttribute("msg", "Order updated successfully!");
			}
			
		orderService.saveOrUpdate(order);
			
			// POST/REDIRECT/GET
			return "redirect:/orders/" +order.getId();

			// POST/FORWARD/GET
			// return "user/list";

		}

	}

	// show update form
	@RequestMapping(value = "/users/{id}/update", method = RequestMethod.GET)
	public String showUpdateUserForm(@PathVariable("id") int id, Model model) {

		logger.debug("showUpdateUserForm() : {}", id);

		User user = userService.findById(id);
		model.addAttribute("userForm", user);
		
		populateDefaultModel(model);
		
		return "users";

	}

	// delete user
	@RequestMapping(value = "/orders/{id}/delete", method = RequestMethod.POST)
	public String deleteOrder(@PathVariable("id") int id, final RedirectAttributes redirectAttributes) {

		logger.debug("deleteOrder() : {}", id);

		orderService.delete(id);
		
		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg", "Order is deleted!");
		
		return "redirect:/orders";

	}

	// show user
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String showOrder(@PathVariable("id") int id, Model model) {

		logger.debug("showUser() id: {}", id);

		Order order = orderService.findById(id);
		if (order == null) {
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "User not found");
		}
		model.addAttribute("order", order);

		return "orders";

	}

	

	}



