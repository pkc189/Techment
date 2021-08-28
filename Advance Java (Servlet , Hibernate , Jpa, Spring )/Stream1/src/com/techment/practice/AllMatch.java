package com.techment.practice;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,6,9,4,78,56,34);
		
		list.stream().filter(n->n%3==0).forEachOrdered(System.out::println);
		
		
		
	}

}
