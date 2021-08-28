package com.techment.practice;

import java.util.Arrays;
import java.util.List;

public class MapToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 19, 20, 1, 2);
	      
	    // Using forEachOrdered(Consumer action) to 
	    // print the elements of stream in encounter order
	    list.stream().forEach(System.out::println);



		
	}

}
