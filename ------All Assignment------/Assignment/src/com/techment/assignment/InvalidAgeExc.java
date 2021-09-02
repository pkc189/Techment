package com.techment.assignment;

import java.util.Scanner;

public class InvalidAgeExc {

	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Age :");
		int age = scanner.nextInt();
		
           try {
        	   checkAge(age);  
           }
           catch(Exception a ) {
        	   System.out.println("Exception occured "+a.getMessage());
           }

	}
	
	
	static void checkAge(int age) throws Exception
	 {
		if(age<18)
			throw new Exception("No you can't Vote");
		else 
			System.out.println("You can vote");
	
	}

}



class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  