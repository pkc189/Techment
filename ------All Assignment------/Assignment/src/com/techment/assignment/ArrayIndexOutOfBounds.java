package com.techment.assignment;


import java.util.Scanner;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		
try {
	System.out.println("Enter input size :");
	Scanner scanner = new Scanner(System.in);
	int size = scanner.nextInt();
	
int[] arr = new int[size];
System.out.println("Enter Array : ");

for(int i =0;i<size;i++)
{
int data = scanner.nextInt();
arr[i] = data;
}


System.out.println("Enter index :");
int index = scanner.nextInt();


System.out.println("Value is : "+arr[index]);
}
catch(Exception e)
{
	System.out.println(e);
}
		
	}

}
