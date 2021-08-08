package com.techment.keyword;


class A{
	int a = 10;
}

class B extends A{
	int a = 20;
	
	void show(int a) {
		System.out.println(super.a);
	}
}


public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		obj.show(30);
	}

}
