package com.project.couriers.service;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

public interface AdminServiceInt {
	  public boolean login(Admin user);
}
