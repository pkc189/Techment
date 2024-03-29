package com.techment.practice;

import java.time.LocalDate;
import java.util.Scanner;

class AgeCalculator {

	private int age;

	int calculateAge(String dob) throws invalidDob {
		
	int date = Integer.parseInt(dob.substring(0, 2));
	int month = Integer.parseInt(dob.substring(3, 5));
	int year = Integer.parseInt(dob.substring(6, 10));
	

  int today = LocalDate.now().getYear();
	
	
	//System.out.println(date +" "+month+" "+year);
		
	if(dob.length()==10 && date>0 && date<=31 && month>0 && month <=12 && year>1111 && dob.charAt(2)=='/' && dob.charAt(5)=='/')
	{
		return today-year;
	}else
		throw new invalidDob("invalid age");
		
		
		
		
		
		
		
		
	}
}


class invalidDob extends Exception{
	
	public invalidDob(String msg)
	{
		super(msg);
	}
}


public class Age {

	public static void main(String[] args) throws invalidDob {

		try {
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter dob in dd/mm/yyyy ");
			String dob = scanner.next();

			AgeCalculator obj = new AgeCalculator();

			System.out.println(obj.calculateAge(dob));
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
