package com.techment.array.assignment;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		// After Sorting Elements
System.out.println("After Sorting elements are ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}