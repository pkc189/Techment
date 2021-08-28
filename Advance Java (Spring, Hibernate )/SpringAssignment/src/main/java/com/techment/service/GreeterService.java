package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.GoodDayGreeting;
import com.techment.dao.Greeting;

@Service("hw")
public class GreeterService {

	@Autowired
	@Qualifier("goodDayGreeting")
	Greeting greeting;
	

	
	public String displayService()
	{
		
		return greeting.greet();
		
	}
	
}
