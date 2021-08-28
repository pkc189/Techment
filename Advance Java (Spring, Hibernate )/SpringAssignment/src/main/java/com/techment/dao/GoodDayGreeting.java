package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GoodDayGreeting implements Greeting {
	
	String greeting = "Have a good day";

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

	// looking for sdtring value
	
	public GoodDayGreeting() {
		
	}
	
	public GoodDayGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	

}
