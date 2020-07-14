package com.project.couriers.service;

import com.project.couriers.model.PaymentModel;

public interface PaymentServicesInt {
	public boolean findPayment(PaymentModel payment);
	public boolean update(PaymentModel payment);
}
