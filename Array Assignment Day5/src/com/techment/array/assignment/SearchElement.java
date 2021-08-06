package com.techment.array.assignment;



import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

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
		
	
		System.out.println("Enter element for search in array ");
		
		int search = scanner.nextInt();
		
		boolean found = false;
		int pos = -1;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==search)
				{
				found=true;
				pos=i+1;
				}
				
		}
		
		if(found)
		{
			System.out.println("Element found at position "+pos);
		}
		else {
			System.out.println(pos);
		}
		
	}

}