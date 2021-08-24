package com.techment.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		
	String dob = "06/10/1998";
	
	String joiningDate = "2020-02-22";
	
	LocalDate date = LocalDate.parse(joiningDate);
	
	System.out.println(date);
		
	
	
	System.out.println("========================");

//	
//	System.out.println(birth);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	LocalDate current  =LocalDate.now();
	LocalDate birth = LocalDate.parse(dob, dtf);
	
	System.out.println(Period.between(birth, current));
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
