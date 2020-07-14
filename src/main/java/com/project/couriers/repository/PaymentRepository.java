
package com.project.couriers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.project.couriers.model.PaymentModel;
@Repository
public interface PaymentRepository extends JpaRepository<payment, Long> {
	

}