package com.techment.day12.newfeature;

@FunctionalInterface 
interface Bank1{
	void rateOfInterest();
	
	default void display() {
		System.out.println("default");
	}
	
	static void loan() {
		System.out.println("you can apply");
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
