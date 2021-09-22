package com.techment.debug;

public class ArrayDemo {
public static void main(String[] args) {
	
	int k =0;
	int[][] arr = new int[3][4];
	
	for(int i =1;i<arr.length;i++)
	{
		for(int j=1;j<arr[i].length;j++)
		{
			arr[i][j]=++k;
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
	
}
