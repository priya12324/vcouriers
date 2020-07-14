package com.project.couriers.service;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.couriers.dao.Paymentdao;
import com.project.couriers.dao.ShippingDaoImpl;
import com.project.couriers.model.Order;
import com.project.couriers.model.PaymentModel;
import com.project.couriers.model.ShippingModel;


@Service
@Transactional
@EnableTransactionManagement
public class ShippingServices implements ShippingServicesInt {
	

	@Autowired
	private ShippingDaoImpl Shippingdao;
	
	@Autowired
	private ShippingModel Shipping;
	public void delete(Integer id){
		return Shippingdao.delete(id);
	}
	
	
	public List<Order> findShipment() {
		return Shippingdao.findShipment(Shipping));

}
	public void save(ShippingModel ShippingModel)
	{
		
	return Shippingdao.save(Shipping));
	}
}

