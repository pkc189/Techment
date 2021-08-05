package com.techment.day4.oops;

class Parent1{
	Parent1(){
		System.out.println("PArent");
	}
}

class Child1 extends Parent1{
	
	Child1()
	{
		System.out.println("Child");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Child1 child1 = new Child1();
	}

}
