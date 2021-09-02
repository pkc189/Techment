package com.techment.assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number for multiplication :");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num +" X " + i + " = "+ num*i);
		}
	}

}
