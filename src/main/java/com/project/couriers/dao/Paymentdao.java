package com.project.couriers.dao;

import java.util.List;

import com.project.couriers.model.PaymentModel;

 public interface Paymentdao {


	
	void findPayment(PaymentModel payment);

	void update(PaymentModel payment);

	
}