package com.project.couriers.service;

import java.util.List;

import com.project.couriers.dao.Userdao;
import com.project.couriers.model.User;

public interface UserServiceInt {
	public boolean login(User user);
	public void setUserDao(Userdao userdao) ;
	public User findByName(String name);
	

}
