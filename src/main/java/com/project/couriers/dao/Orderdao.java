package com.project.couriers.dao;

import java.util.List;

import com.project.couriers.model.Order;

public interface Orderdao {

	Order findById(Integer id);

	List<Order> findAll();

	void save(Order order);

	void update(Order order);

	void delete(Integer id);

}