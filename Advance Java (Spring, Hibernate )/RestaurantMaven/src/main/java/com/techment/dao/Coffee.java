package com.techment.dao;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements IHotDrink {

	 

	public void drink() {
		System.out.println("Coffee was nice");
		
	}
 

	 
}
