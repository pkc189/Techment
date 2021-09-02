package com.techment.assignment;

import java.util.Scanner;

public class MatrixMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter n :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int mat[][] = new int[num][num];
		int mirr[][] = new int[num][num];
		
		int sum =0;
		
		for(int i =0; i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
			  System.out.println("Enter "+i+""+j+" matrix");
			  int data = scanner.nextInt();
				mat[i][j]=data;
				
			}
		}
		
		
		
		 System.out.println("Original Matrix is :");
	      
	      
	      for(int i =0; i<num;i++)
			{
				for(int j=0;j<num;j++)
				{
				 
	      System.out.print(mat[i][j]+" ");
				
					
				}
				System.out.println();
			}
	      
		
		
		for(int i =0; i<num;i++)
		{
			int img = 0;
			for(int j=num-1;j>=0;j--)
			{
			 

             int temp = mat[i][j];
            mirr[i][img]=temp;
            img++;
			
				
				
			}
		}
		
	
	      
		
		
		
      System.out.println("\n2Mirror Matrix is :");
      
      
      for(int i =0; i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
			 
      System.out.print(mirr[i][j]+" ");
			
				
			}
			System.out.println();
		}
      
      
      
	}

}
