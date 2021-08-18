package com.techment.day13;

interface LargeNumber{
	int largest(int a,int b,int c);
}

class Calculationutil{
	int findLargest(int a,int b,int c)
	{
		if(a>b && a>c) return a;
		else if(b>a && b>c) return b;
		else return c;
	}
}


public class GetLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargeNumber largeNo =(a,b,c)->
		{
			if(a>b && a>c)  
				return a;
			else if(b>a && b>c)
				return b;
			else 
				return c;
		};
		
		System.out.println(largeNo.largest(3, 5, 7));
		
		Calculationutil cal = new Calculationutil();
		
		System.out.println(cal.findLargest(3, 7, 8));
		
		
	}

}
