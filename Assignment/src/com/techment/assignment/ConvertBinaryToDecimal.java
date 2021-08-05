package com.techment.assignment;

import java.util.Scanner;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Enter Binary number ");
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  
  int i =0,sum=0;
  while(n!=0)
  {
	  int rem = n%10;
	  
	  sum+=rem*Math.pow(2,i);
	  i++;
	  n=n/10;
  }
  
  System.out.println("Decimal number is : "+sum);
  
	}


}
