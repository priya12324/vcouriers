package com.project.couriers.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@SuppressWarnings("serial")
public class UnsupportedOperationException extends Exception  {
	

	public UnsupportedOperationException(final String message) { 
		super(message);
		    }
	public UnsupportedOperationException() { 
		super();

		
    }

}
