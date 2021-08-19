package com.techment.two;

class RepeatFront{
	private String words;
	
	String RepeatImpl(String words,int limit)
	{
		String str = "";
		int k=0;
		for(int i = limit;i>=0;i--)
		{

               str+=words.substring(k,i);
		}
		
		
		return str;
		
	}
	
}



public class RepeatFrontByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RepeatFront obj = new RepeatFront();
		System.out.println("Chocolate  for 4 Chars is " + obj.RepeatImpl("Chocolate", 4));
		System.out.println("Chocolate  for 3 Chars is " + obj.RepeatImpl("Chocolate", 3));
		System.out.println("Icecream  for 2 Chars is " + obj.RepeatImpl("Icecream", 2));
		
		
		
		
		
		
		
	}

}
