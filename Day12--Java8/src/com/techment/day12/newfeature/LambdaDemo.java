package com.techment.day12.newfeature;

interface Bank{
	void display();
}



public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = () ->System.out.println("this is display method");
		bank.display();
		
		Bank bank2=()->
		{
			System.out.println("this is display method");
		};
		bank2.display();
		
	}

}
