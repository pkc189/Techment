package com.techment.seven;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;



public class ArrayListDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = scanner.nextInt();

		ArrayList<Integer> original = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter data");
			int data = scanner.nextInt();

			original.add(data);
		}
//		int first=0,second=0;
//		if(size%2==0)
//		{
//			first = size/2;
//			second=size/2;
//			
//		}else {
//			first=size/2;
//			second=(size-size/2);
//		}
//		
//		
//		original.stream().iterator()
		
		ArrayList<Integer> firstArray = new ArrayList<Integer>(original.subList(0, (size) / 2));
		ArrayList<Integer> secondArray = new ArrayList<Integer>(original.subList((size) / 2,size));

	System.out.println(firstArray.stream().max(Comparator.naturalOrder()).get());
		int max2 = secondArray.stream().max(Integer::compare).get();
		//System.out.println(max1+" "+max2);
		System.out.println(max2);
		int max2 = secondArray.stream().max(Integer::compare).get();
	}

}
