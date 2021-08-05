package com.techment.assignment;

import java.util.Scanner;

public class MatrixManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter n :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int mat[][] = new int[num][num];
		
		int sum =0;
		
		for(int i =0; i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
			  System.out.println("Enter "+i+""+j+" matrix");
			  int data = scanner.nextInt();
				mat[i][j]=data;
				sum+=data;
			}
		}
		
		System.out.println("Sum is "+sum);
		

	}

}
