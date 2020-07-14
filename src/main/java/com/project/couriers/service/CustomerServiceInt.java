package com.project.couriers.service;

import java.util.List;

import com.project.couriers.dao.Customerdao;
import com.project.couriers.dto.ApiResponse;
import com.project.couriers.dto.LoginDto;
import com.project.couriers.dto.SignUpDto;
import com.project.couriers.model.Customer;

public interface CustomerServiceInt {
	
	 ApiResponse signUp(SignUpDto signUpDto);

	    ApiResponse login(LoginDto loginDto);
	    public boolean login(Customer user);
	    public void setCustomerDao(Customerdao customerdao);
	    

}
