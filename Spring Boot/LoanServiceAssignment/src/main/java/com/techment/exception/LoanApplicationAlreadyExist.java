package com.techment.exception;

public class LoanApplicationAlreadyExist extends RuntimeException{

	public LoanApplicationAlreadyExist(String msg) {
		super(msg);
	}
}
