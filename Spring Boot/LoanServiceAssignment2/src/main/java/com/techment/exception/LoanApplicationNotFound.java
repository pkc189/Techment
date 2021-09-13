package com.techment.exception;

public class LoanApplicationNotFound extends RuntimeException{

	public LoanApplicationNotFound(String msg)
	{
		super(msg);
	}
}
