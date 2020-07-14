package com.project.couriers.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.project.couriers.model.User;
@Repository
public interface AdminRepository extends JpaRepository<User, Long> {
	User findById(Integer username, String password);

}