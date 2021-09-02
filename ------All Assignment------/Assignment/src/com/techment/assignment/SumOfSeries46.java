package com.techment.assignment;

import java.util.Scanner;

public class SumOfSeries46 {

	public static  float fact(int x) {
		float fac=1;
		for(int i =1;i<=x;i++)
		{
			fac = fac*i;
		}
		return fac;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
	
	
		
		float sum =0;
		
		for(int i =1;i<=n;i++)
		{
			sum += i/fact(i);
		}
		
		System.out.println("The sum of series is "+sum);
		
	}

}
