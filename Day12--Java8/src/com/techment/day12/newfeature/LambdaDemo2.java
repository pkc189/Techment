package com.techment.day12.newfeature;

interface Calculation 
{
	//void add(int a,int b);
	String largest(int a, int b,int c);
}


public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lambda exp with parameters
//		Calculation calculation = (a,b)->System.out.println("Result "+a+b);
//	calculation.add(2, 3);
//	
		
//		Calculation calculation1 =(a,b)->a+b;
//		Calculation calculation2 =(a,b)->{
//			if(a>b)
//				return a;
//			return b;
		
		Calculation largNumber=(a,b,c)->{
			if(a>b && b>c)
				return a+" is largest";
			else if(b>c && b>a)
				return b+" is largest";
			else return c+" is largest";
		
		};
		
		
		System.out.println(largNumber.largest(7,5,3));
		
	}

}
