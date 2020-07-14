
package com.project.couriers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.project.couriers.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String username, String password);

}