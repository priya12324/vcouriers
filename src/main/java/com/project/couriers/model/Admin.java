package com.project.couriers.model;





import javax.persistance.Column;
import javax.persistance.Entity;
import javax.persistance.Id;
import javax.persistance.Table;


@Entity
@Table(name="admin")
public class User {
	@Id
	@Column(name="USER_ID")
	private Integer userId;
	@Column(name="PASSWORD")
	
	private String password;
	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", password=" + password + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Integer userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	
	

}
