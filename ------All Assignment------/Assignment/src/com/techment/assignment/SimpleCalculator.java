package com.techment.assignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter first number :");
			float num1 = sc.nextFloat();
			System.out.print("Enter operator :");
			char c = sc.next().charAt(0);

			System.out.print("Enter Second number :");
			float num2 = sc.nextFloat();
				
			
			switch(c)
			{
			case '+':
				System.out.print("Sum is :"+num1+num2);
				break;
				
			case '-':
				System.out.print("Subtraction is :"+(num1-num2));
				break;
				
			case '*':
				System.out.print("Mul is :"+num1*num2);
				break;
				
			case '/':
				System.out.print("Div is :"+num1/num2);
				break;
				
				default :
					System.out.print("Wrong operator");
				
			}
					
		}
		finally{
			sc.close();
		}


	}

}
