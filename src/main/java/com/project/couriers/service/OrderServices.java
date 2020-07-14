package com.project.couriers.service;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.couriers.dao.OrderDaoImpl;
import com.project.couriers.model.Order;


@Service
@Transactional
public class OrderServices implements  OrderServicesInt{

	@Autowired
	private OrderDaoImpl OrderDao;
	public List<Order> findAll(String placed_date,String shipped_date,String delivery_date,Integer id) {
		return OrderDao.findAll(placeddate,shippeddate,deliveydate,shippeddate,id);
	}
	
	@override
	public boolean save(Order order) {
		return OrderDao.save(order);
	}
	
	@override
	public boolean update(Order order) {
		return OrderDao.updateOrder(order));
		
	}
	@override
	public boolean delete(Order order) {
		// TODO Auto-generated method stub
		return OrderDao.delete(order);
	}
}

