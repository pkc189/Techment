package com.techment.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter full=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		
		DateTimeFormatter longdate=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		DateTimeFormatter medium=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		
		LocalDateTime todaydateTime = LocalDateTime.now();
		
		System.out.println(todaydateTime);
		
		System.out.println(todaydateTime.format(full));
		
		
		ZonedDateTime date = ZonedDateTime.now();
		System.out.println(today.format(full));
		System.out.println(today.format(longdate));
		System.out.println(today.format(medium));
	}

}
