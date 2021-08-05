package com.techment.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class WhatIsYourAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter your DOB in YYYY-MM-DD format :");
		Scanner scanner = new Scanner(System.in);
		String dob = scanner.next();
		int dobDate = Integer.parseInt(dob.substring(0,4));
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("Your age is "+(year-dobDate)+" years");
		
	}

}
