package com.techment.assignment;


import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter num: ");
			int n = sc.nextInt();
			int i,num;
			for (i = 1; i <= n; i++)  	   
		      { 		 		  
		         int counter=0; 		  
		         for(num =i; num>=1; num--)
		         {
			    if(i%num==0)
			    {
				counter = counter + 1;
			    }
			 }
			 if (counter ==2)
			 {
			  System.out.print(i+" ");
			 }	
		      }	
			
		}
		finally {
			sc.close();
		}

	}

}
