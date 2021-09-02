package com.techment.assignment;

import java.util.Scanner;

public class LeapYearEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter Year : ");
		  Scanner sc = new Scanner(System.in);
		
		try {
			
			int year = sc.nextInt();
			
			if(year%400 == 0)
				System.out.print("Leap Year");
			else 
				System.out.print("Not a Leap Year");
			
		}
		finally {
			sc.close();
		}
		
	}

}
