package com.techment.assignment;

import java.util.Scanner;
public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.print("Enter number :" );
		Scanner scanner = new Scanner(System.in);
		int numb = scanner.nextInt();
		
		int [] arr = new int[(2*numb)+1];
		arr[0] = numb;
		boolean check = true;
		for(int i =0;i<numb;i++)
		{
			System.out.print("Enter 1st Array "+ i +" value");
			int data = scanner.nextInt();
			arr[i]=data;
		}
		
		int j =0;
		System.out.print(System.lineSeparator());
		for(int i =numb;i<2*numb;i++)
		{
			System.out.print("Enter 2nd Array "+ (j) +" value");
			int data = scanner.nextInt();
			arr[i]=data;
			
			if(arr[j]!=data)
			{
				check = false;
			}
			j++;
			
		}
		
		
//		for(int i =0 ;i<2*numb;i++)
//			System.out.print(arr[i]+" ");
		
		
		scanner.close();
		
		if(check)
			System.out.print("Both Arrays are Same");
		else 
			 System.out.print("Both are different Arrays");
             
	}

}
