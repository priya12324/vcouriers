package com.project.couriers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.project.couriers.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer>	 findByName(String username,String password);

}