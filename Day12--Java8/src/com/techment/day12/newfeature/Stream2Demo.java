package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	
		
		for(int i=1;i<=10;i++)
			numbers.add(i);
		
		System.out.println("numbers "+numbers);
		
		numbers.stream().filter(num->num%2==0).forEach(System.out::println);
	numbers.stream().map(num->num+5).forEach(i->System.out.println(i));	
	numbers.stream().limit(4).forEach(i->System.out.println(i));
	
		
//	List<Integer> nu = Arrays.asList(1,2,4);
//	nu.stream().filter(n->)
	
	}

}
