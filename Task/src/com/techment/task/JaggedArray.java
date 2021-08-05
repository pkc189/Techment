package com.techment.task;


public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[2][];
		
		arr[0] = new int[3];
		arr[1] = new int[5];
		
		for(int i=0; i<arr.length;i++)
			{for(int j=0;j<arr[i].length;j++)
				System.out.print(j+" ");
		System.out.println();}
		

	}

}
