package com.techment.task;


import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		
			
			System.out.print("Enter number of lines : ");
			int num = sc.nextInt();
			
//Patter 1
			
//			for(int i = 0;i<num;i++)
//			{
//				for(int j =0 ; j<i;j++)
//				{
//					System.out.print(" * ");
//				}
//				System.out.println();
//			}

			
			
			
//Patter 2
			
//			for(int i = 1;i<=num;i++)
//			{
//				for(int j =1 ; j<=i;j++)
//				{
//					System.out.print(" "+j+" ");
//				}
//				System.out.println();
//			}
//			
			
			
			
//Pattern 3
			
//			for(int i = 1;i<=num;i++)
//			{
//				for(int j =1 ; j<=num;j++)
//				{
//					if(i==1 || i==num)
//					System.out.print("*");
//					else if ((i>1 && i<num) && (j>1 && j<num))
//						System.out.print(" ");
//					else
//						System.out.print("*");
//						
//					
//				}
//				System.out.println();
//			}
			
			

//Pattern 4
//			int s =1;
//			for(int i = 1;i<=num;i++)
//			{
//				for(int j =1 ; j<=i;j++)
//				{
//                    
//					System.out.print(s);
//					s++;
//                   
//                    	 
//					
//				}
//				System.out.println();
//			}
			
			
			
			
			
//Pattern 5
			
//			for(int i = 1;i<=num;i++)
//			{
//				for(int j =1 ; j<=i;j++)
//				{
//                     if(j==i)
//					System.out.print("*");
//                     else
//                    		System.out.print(" ");
//                    	 
//					
//				}
//				System.out.println();
//			}
			

			sc.close();
		

	}

}
