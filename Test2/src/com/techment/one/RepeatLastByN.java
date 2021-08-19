package com.techment.one;

class RepeatLast {
	private String words;

	String RepeatImpl(String words, int limit) {
		String str = "";
		int k = 0;
		for (int i = limit; i > 0; i--) {

			str += words.substring(words.length() - limit, words.length());
		}

		return str;

	}

}

public class RepeatLastByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepeatLast obj = new RepeatLast();
		System.out.println("Hello  for 3 Chars is " + obj.RepeatImpl("Hello", 3));
		System.out.println("Hello  for 2 Chars is " + obj.RepeatImpl("Hello", 2));
		System.out.println("Hello  for 1 Chars is " + obj.RepeatImpl("Hello", 1));

	}

}
