package com.project.couriers.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.couriers.dao.Userdao;
import com.project.couriers.model.User;
import com.project.couriers.repository.UserRepository;

@Service
@Transactional
public class UserService implements UserServiceInt{

	Userdao userdao;

	@Autowired
	public void setUserDao(Userdao userdao) {
		this.userdao = userdao;
	}
	
		@Autowired
		private UserRepository userRepository;

		@Override
		public boolean login(User user) {
			final List<User> loginUser = UserRepository
					.findByName(user.getUsername(), user.getPassword());

			if (loginUser != null && !loginUser.isEmpty()
					&& loginUser.size() > 0) {
				return true;
			}

			return false;
		}

	


   @override
	public User findByName(String name) {
		return userdao.findByName(name);
	}
  
   @Override
	public List<users> findAll() {
		return this.UserrRepository.findAll();
	}

}
