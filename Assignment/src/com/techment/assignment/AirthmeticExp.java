package com.techment.assignment;


import java.util.Scanner;

public class AirthmeticExp {

	public static void main(String[] args) {


		try {
			
			Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter first number : ");
			int a = scanner.nextInt();
			
			
			System.out.print("Enter Second number : ");
				int b = scanner.nextInt();
				
			int data = a/b;
			
			System.out.print(data);	
				
		}
		catch(Exception a)
		{
			System.out.println(a);
			
		}
		finally {
			System.out.println("\nFinally code ");
		}

	}

}

