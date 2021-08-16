package com.techment.day12.newfeature;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		
		nums.stream().forEach(i->System.out.println(i));
	
		//method refrence
		nums.stream().forEach(System.out::println);
	
	}

}
