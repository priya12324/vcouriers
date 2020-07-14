
package com.project.couriers.service;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.couriers.dao.Customerdao;
import com.project.couriers.dto.ApiResponse;
import com.project.couriers.dto.LoginDto;
import com.project.couriers.dto.SignUpDto;
import com.project.couriers.model.Customer;
import com.project.couriers.repository.CustomerRepository;


@Service
@Transactional
public class CustomerService implements CustomerServiceInt
{

	Customerdao customerdao;

	@Autowired
	public void setCustomerDao(Customerdao customerdao) {
		this.customerdao = customerdao;
	}
	
	/* @Override
	    public ApiResponse signUp(SignUpDto signUpDto) {
	        validateSignUp(signUpDto);
	        Customer user = new Customer();
	        BeanUtils.copyProperties(signUpDto, user);
	        customerRepository.save(user);
	        return new ApiResponse(200, "success", user);
	    }*/
	
	// public class LoginServiceImpl implements LoginService {

	 	@Autowired
	 	private CustomerRepository CustomerRepository;

	 	@Override
	 	public boolean login(Customer user) {
	 		final List<Customer> loginCustomer = CustomerRepository
	 				.findByName(user.getUsername(), user.getPassword());

	 		if (loginCustomer != null && !loginCustomer.isEmpty()
	 				&& loginCustomer.size() > 0) {
	 			return true;
	 		}

	 		return false;
	 	}

	 

	 
	 @Override
	    public ApiResponse login(LoginDto loginDto) {
	        Customer user = CustomerRepository.findByUsername(loginDto.getUsername());
	        if(user == null) {
	            throw new RuntimeException("User already exist.");
	        }
	        if(!user.getPassword().equals(loginDto.getPassword())){
	            throw new RuntimeException("Password mismatch.");
	        }
	        return new ApiResponse(200, "Login success", null) ;

	    }


   @override
	public Customer findByName(String name) {
		return customerdao.findByName(name);
	}
  
   @Override
	public List<customers> findAll() {
		return this.CustomerRepository.findAll();
	}

}
