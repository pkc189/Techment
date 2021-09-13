package com.techment.exception;

public class InvalidUserException extends RuntimeException {
	String msg;

	public InvalidUserException(String msg) {
	
		super(msg);
		
	}
}
