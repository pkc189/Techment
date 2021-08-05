package com.techment.assignment;


import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
			
			System.out.print("Enter number of lines : ");
			int num = sc.nextInt();
	

			for(int i =num; i>0; i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			
			sc.close();
		

	}

}
