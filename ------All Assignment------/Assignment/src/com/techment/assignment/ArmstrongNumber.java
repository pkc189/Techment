package com.techment.assignment;


import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter num: ");
			int num = sc.nextInt();
			
			
			int sum =0,temp = num;
			
			
			while(temp>0)
			{
				int rem = temp%10;
				sum += Math.pow(rem, 3);
				
				temp = temp/10;
				
			}
			
			
			if(sum==num)
				System.out.print("Armstrong numb");
			else System.out.print("Not an armstrong numb");
			
		}
		finally {
			sc.close();
		}

		
		
	}

}
