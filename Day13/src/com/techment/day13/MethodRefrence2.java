package com.techment.day13;

interface Calculate {
	int add(int a, int b);
}

class Add {
	int addition(int a, int b) {
		return a + b;
	}
}

class Sub {
	static int sub(int a, int b) {
		return a - b;
	}
}

public class MethodRefrence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal = (a, b) -> a + b;

		System.out.println(cal.add(7, 3));

		Add add1 = new Add();
		//Sub sub1 = new Sub();
		
		Calculate c1 = add1::addition;
		// c1 = add1::Sub.sub;
		System.out.println(c1.add(6, 7));

	}

}
