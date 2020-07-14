package com.project.couriers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.project.couriers.model.Customer;
import com.project.couriers.repository.AdminRepository;
import com.project.couriers.repository.CustomerRepository;

public class AdminService {
	
	
	
	
	@Autowired
 	private CustomerRepository CustomerRepository;

 	@Override
 	public boolean login(Admin user) {
 		final List<Admin> loginCustomer = AdminRepository
 				.findById(user.getUserId(), user.getPassword());

 		if (loginCustomer != null && !loginCustomer.isEmpty()
 				&& loginCustomer.size() > 0) {
 			return true;
 		}

 		return false;
 	}

}
