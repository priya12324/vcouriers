package com.project.couriers.dao;

import java.util.List;

import com.project.couriers.model.Order;

import com.project.couriers.model.ShippingModel;

public interface Shippingdao {


	
	void findShipment(ShippingModel Shipping);

	//void delete(ShippingModel shipping);
	//void save(Order order);
	public void delete(Integer id);
	public List<Order> findShipment();
	public void save(ShippingModel ShippingModel);


	
}