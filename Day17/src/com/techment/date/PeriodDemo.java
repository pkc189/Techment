package com.techment.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate current  =LocalDate.now();
	LocalDate ld =	LocalDate.of(1989, 11, 30);
		
	Period pd =	Period.between(current, ld);
	System.out.println(pd.getYears());
	}

}
