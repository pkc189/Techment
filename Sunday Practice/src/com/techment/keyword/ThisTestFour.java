package com.techment.keyword;

class A1 {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
//m();//same as this.m()  
		m();
	}
}

public class ThisTestFour {
	public static void main(String args[]) {
		A1 a = new A1();
		a.n();
	}
}