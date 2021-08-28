package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements Greeting {
	
	String greeting = "Good morning";

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

	public MorningGreeting() {
		
	}
	
	public MorningGreeting(String greeting) {
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
