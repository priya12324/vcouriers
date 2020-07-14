package com.project.couriers.service;

import java.util.List;

import com.project.couriers.model.Order;
import com.project.couriers.model.ShippingModel;

public interface ShippingServicesInt {
	
	public void delete(Integer id);
	public List<Order> findShipment();
	public void save(ShippingModel ShippingModel);

}
