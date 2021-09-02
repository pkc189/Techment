package com.techment.assignment;

import java.util.Scanner;

public class DivisibleBy8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Enter Amount : ");
   int amt = scanner.nextInt();
  if(amt % 8 ==0 && amt%3 ==0)
	  System.out.print("Go Buy it");
  else  System.out.print("Don't Buy it");
   
   
   
	}

}
