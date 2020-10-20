package com.valdir.mc.services.exceptions;

public class ObjectNotFoubdException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoubdException(String message) {
		super(message);
	}

	public ObjectNotFoubdException(String message, Throwable cause) {
		super(message, cause);
	}

}
