package com.techment.array.assignment;


import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Enter size of 1st array ");
		Scanner scanner = new Scanner(System.in);
		int size1 = scanner.nextInt();
		int arr1[] = new int[size1];
		
		for(int i =0;i<arr1.length;i++)
		{
			arr1[i] = scanner.nextInt();
		}
		
		
		System.out.println("Enter size of 2nd array ");

		int size2 = scanner.nextInt();
		int arr2[] = new int[size2];
		
		
		
		
		
		for(int i =0;i<arr2.length;i++)
		{
			arr2[i] = scanner.nextInt();
		}
		
		// Trying to merge all array
		
		
		
		
		int a = arr1.length;
		int b = arr2.length;
		
		
		int mergeArray[] = new int[a+b];
		System.arraycopy(arr1, 0, mergeArray,0, a);   
		System.arraycopy(arr2, 0, mergeArray,a,b);   

		
		for (int i = 0; i < mergeArray.length; i++)   
			System.out.print(mergeArray[i] + " ");   
			
		
		
		
		
		
		
		
		
		
		
	}

}