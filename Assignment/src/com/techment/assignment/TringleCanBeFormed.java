package com.techment.assignment;

import java.util.Scanner;

public class TringleCanBeFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Enter three Sides ");
   Scanner scanner = new Scanner(System.in);
   
   int a = scanner.nextInt();
   int b = scanner.nextInt();
   int c = scanner.nextInt();
   
   
   if(a+b>c || a+c>b || b+c>a)
	   System.out.println("Triangle can be formed");
   else
	   System.out.println("Triangle Can't be formed");
   
	}

}
