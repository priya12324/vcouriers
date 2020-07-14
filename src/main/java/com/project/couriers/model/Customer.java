package com.project.couriers.model;



import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.Id;
import javax.persistance.Table;


@Entity
@Table(name="customers")
public class Customer {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer userId;
	@Column(name="USER_NAME")
	private Integer username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="MAIL_ID")
	private String maildId;
	@Column(name="MOBILE_NO")
	private String mobileno;
	@Column(name="ADDRESS")
	private String address;
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ",username=" + username + ", password=" + password + ", maildId=" + maildId + ", mobileno=" + mobileno
				+ ", address=" + address + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String Username) {
		this.Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMaildId() {
		return maildId;
	}
	public void setMaildId(String maildId) {
		this.maildId = maildId;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(Integer userId, String password, String maildId, String mobileno, String address) {
		super();
		this.userId = userId;
		this.password = password;
		this.maildId = maildId;
		this.mobileno = mobileno;
		this.address = address;
	}
	
	
	

}
