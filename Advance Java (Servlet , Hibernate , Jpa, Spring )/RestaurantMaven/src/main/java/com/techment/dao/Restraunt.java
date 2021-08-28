package com.techment.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class Restraunt {

	String restrauntName;
	
 
    @Autowired
	IHotDrink hotDrink;
    
    @Autowired
	ISoftDrink softDrink;
 
	
	
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void setSoftDrink(ISoftDrink softDrink) {
		this.softDrink = softDrink;
	}

	public void displayRestrauntDetails()
	{
		System.out.println("restraunt name :"+restrauntName);
	
		hotDrink.drink();
		softDrink.drink();
		 
		 
	}

	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	 

 


	
	
	
}
