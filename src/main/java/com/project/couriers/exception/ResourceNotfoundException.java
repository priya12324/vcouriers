package com.project.couriers.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ResourceNotfoundException extends Exception {

	private static final long serialVersionUID = -9079454849611061074L;

	public ResourceNotfoundException() {
		super();
	}

	public ResourceNotfoundException(final String message) {
		super(message);
	}

}