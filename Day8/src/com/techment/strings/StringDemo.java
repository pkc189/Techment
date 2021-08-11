package com.techment.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";//literal
String s2 = "hello";
		
		String s3 = new String("hello");//new keyword
		String s4 = new String("hello");
		
		System.out.println(s1==(s2));
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==(s4));
		System.out.println(s1.equals(s2));
	}

}
