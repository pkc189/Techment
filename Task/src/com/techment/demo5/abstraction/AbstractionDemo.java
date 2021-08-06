package com.techment.demo5.abstraction;



abstract class Bank{
	void Eligibility() {
		System.out.println("above 18 can open account");
	}
	
	abstract int rateOfInterest(int interestRate);
	
	
}

 //when any class extends abstract class , then the sub class has responsible to make body for abstract
// method present in parent class
class Axis extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
		interestRate = 2* interestRate;
		return interestRate;
	}
	
	
}

class Kotak extends Bank{

	@Override
	int rateOfInterest(int interestRate) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Axis();
		System.out.println(bank.rateOfInterest(5));
	}

}
