package com.techment.exception;

class AgeException extends RuntimeException
{
	String msg;
	
	public AgeException(String msg) {
		super();
		this.msg=msg;
	}
}


public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		throw new AgeException("not a valid age");
	}

}
