package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.techment.dao.Restraunt;


public class ClientApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();

		
		Restraunt restraunt = (Restraunt) context.getBean("restraunt");

       restraunt.displayRestrauntDetails();
		
	}

}
