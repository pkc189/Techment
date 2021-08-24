package com.techment.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println("==========================");
	
	LocalDate today = LocalDate.now();
	
	//System.out.println(today.plusYears(3).getDayOfWeek());
	
	
	System.out.println(today.minusYears(500000000));
	
	}

}
