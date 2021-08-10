package com.techment.array.assignment;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int arr[] = {3,3};
		int target = 6;
		
		for(int i = 0;i<arr.length;i++)
		{    
			int rem = target-arr[i];
			for(int j =0;j<arr.length;j++)
			{
				if(arr[j]==rem && i!=j)
				{
					System.out.println("Index is "+j+" "+i);
				}
			}
		}
		
	}

}
