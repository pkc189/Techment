package com.techment.exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("One");
		 try { 
			 System.out.println(1/0);
			 }
		 catch(NullPointerException obj) {
			 System.out.println("don't divide by zero");
		 }
		 
		
		 System.out.println("Welcome");
	}

}
