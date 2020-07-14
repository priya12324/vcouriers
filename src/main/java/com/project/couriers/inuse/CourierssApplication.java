package com.project.couriers.inuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import com.virtusa.ttt.Logging_Example.App;
import com.virtusa.ttt.Logging_Example.Logger;

@SpringBootApplication
public class CourierssApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourierssApplication.class, args);
		 PropertyConfigurator.configure("C:\\Users\\desktop\\eclipse-workspace\\courierss\\src\\log4j.properties");
	    	Logger log =   Logger.getLogger(App.class.getName());
	    	log.info("welcome ");
	      // 
	}

}
