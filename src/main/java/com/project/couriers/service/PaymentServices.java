package com.project.couriers.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.couriers.dao.OrderDaoImpl;
import com.project.couriers.dao.Paymentdao;
import com.project.couriers.model.PaymentModel;



@Service
@Transactional
public class PaymentServices implements  PaymentServicesInt{

	@Autowired
	private Paymentdao Paymentdao;
	public boolean findPayment(PaymentModel payment) {
		return Paymentdao.findPayment(payment);
	}
	
	
	public boolean update(PaymentModel payment) {
		return Paymentdao.updatePayment(payment));
		
	}


}

