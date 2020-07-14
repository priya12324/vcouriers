package com.project.couriers.model;
import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.Id;
import javax.persistance.Table;
@Entity
@Table(name="order")
public class Order {
	@Id
	@Column(name="ORDER_ID")
	private Integer orderId;
	@Column(name="PLACED_DATE")
	private String placeddate;
	@Column(name="Delivery_DATE")
	private String deliverydate;
	@Column(name="SHIPPED_DATE")
	private String shippeddate;
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", placeddate=" + placeddate + ", deliverydate=" + deliverydate
				+ ", shippeddate=" + shippeddate + "]";
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getPlaceddate() {
		return placeddate;
	}
	public void setPlaceddate(String placeddate) {
		this.placeddate = placeddate;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getShippeddate() {
		return shippeddate;
	}
	public void setShippeddate(String shippeddate) {
		this.shippeddate = shippeddate;
	}
	public Order(Integer orderId, String placeddate, String deliverydate, String shippeddate) {
		super();
		this.orderId = orderId;
		this.placeddate = placeddate;
		this.deliverydate = deliverydate;
		this.shippeddate = shippeddate;
	}
	

}
