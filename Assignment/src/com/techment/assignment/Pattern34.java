package com.techment.assignment;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {

/*
 * 
 *      
7654321
765432
76543
7654
765
76
7
 * 
 */
		
		
		System.out.println("Enter number of lines :");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		
		for(int i=1 ; i<=num; i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
