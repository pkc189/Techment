package com.techment.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter numb1 ");
			int numb1 = scanner.nextInt();
			System.out.println("Enter numb2 ");
			int numb2 = scanner.nextInt();
			System.out.println(numb1/numb2);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Do not give zero");
		}
		catch(InputMismatchException a) {
			System.out.println("please do not give character");
		}
		
	}

}
