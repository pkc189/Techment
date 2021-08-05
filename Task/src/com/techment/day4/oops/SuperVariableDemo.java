package com.techment.day4.oops;


class Parent{
	int a = 10;
}

class Child extends Parent{
	int a =20;
	
	void sum()
	{ int a =3;
		int c = a+a;
		System.out.println("sum :"+c);
		
		int d = this.a+a;
		System.out.println("sum :"+d);
		
		int e = super.a+a;
		System.out.println("sum :"+e);
	}
	
}


public class SuperVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		child.sum();
	}

}
