package com.techment.day13;

interface hello{
	void demo();
}


public class CheckMethodRef {

	public void call() {
		System.out.println("Hello world");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckMethodRef r = new CheckMethodRef();
		hello o =  r::call;
		
		// or this is ame thing
		hello o1 = new CheckMethodRef()::call;
		o1.demo();
		
		
		o.demo();
	}

}
