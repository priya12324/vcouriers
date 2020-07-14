package com.project.couriers.model;

import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.Id;
import javax.persistance.Table;


@Entity
@Table(name="payment")
public class PaymentModel {
	@Id
	@Column(name="PAYMENT_ID")
	private Integer paymentId;
	@Column(name="PAYMENT_-NUM")
	private String paymentNum;
	@Column(name="PAYMENT_DATE")
	private String paymentdate;
	@Column(name="PAYMENT_SUM")
	private String paymentSum;
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentNum=" + paymentNum + ", paymentdate=" + paymentdate
				+ ", paymentSum=" + paymentSum + "]";
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentNum() {
		return paymentNum;
	}
	public void setPaymentNum(String paymentNum) {
		this.paymentNum = paymentNum;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public String getPaymentSum() {
		return paymentSum;
	}
	public void setPaymentSum(String paymentSum) {
		this.paymentSum = paymentSum;
	}
	public Payment(Integer paymentId, String paymentNum, String paymentdate, String paymentSum) {
		super();
		this.paymentId = paymentId;
		this.paymentNum = paymentNum;
		this.paymentdate = paymentdate;
		this.paymentSum = paymentSum;
	}
}