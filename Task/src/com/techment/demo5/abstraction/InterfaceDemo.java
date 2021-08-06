package com.techment.demo5.abstraction;


interface One{
	void greet1();
}

interface Two{
	void greet2();
}


class Employee2 implements One,Two{
	public void greet2() {
		
	}

	@Override
	public void greet1() {
		// TODO Auto-generated method stub
		
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
