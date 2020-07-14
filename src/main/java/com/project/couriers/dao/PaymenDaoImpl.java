package com.project.couriers.dao;

import java.math.BigDecimal;
import java.sql.Date;

import javax.management.Query;
import javax.websocket.Session;

import com.project.couriers.model.PaymentModel;

public class PaymenDaoImpl implements Paymentdao{
	 @Override
	    public PaymentModel findPayment(String tin, String paymentNum, Date paymentDate, BigDecimal paymentSum,
	            String tinDebtor, Short sourceCode) throws Exception {
	        Session session = getSession();
	        // used for bank statement and munis, that is why fetched bank statement and munis
	        String q = "SELECT * FROM payment";
	        Query query = session.createQuery(q);
	        query.setParameter("paymentId", paymentId);
	        query.setParameter("paymentNum", paymentNum);
	        query.setParameter("paymentDate", paymentDate);
	        query.setParameter("paymentSum", paymentSum);
	     
	        PaymentModel payment = (Payment) query.uniqueResult();
	        session.close();

	        return payment;
	    }
	 @Override
	    public void updatePayment(BigDecimal paymentId,  String paymentNum, Date paymentDate,
	            BigDecimal paymentSum) throws Exception {
	        Session session = getSession();
	        Transaction transaction = session.beginTransaction();

	        String q = " SELECT p.id AS id,  p.paymentNum AS paymentNum, p.paymentDate AS paymentDate,"
	                + "  p.paymentSum AS paymentSum
	                + " FROM Payment p " + " WHERE p.id = :paymentId ";
	        Query query = session.createQuery(q);
	        query.setParameter("paymentId", paymentId);
	        query.setResultTransformer(Transformers.aliasToBean(Payment.class));

	        PaymentModel payment = (PaymentModel) query.uniqueResult();
}
}
