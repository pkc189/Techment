package com.techment.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(70);
		nums.add(5);

		System.out.println(nums);

		nums.forEach(s -> System.out.println(s));

		nums.forEach(System.out::println);
		
		nums.stream().sorted().forEach(a->System.out.println(a));
		nums.forEach(System.out::println);
	List<Integer> mySorted =	nums.stream().sorted().collect(Collectors.toList());

List<Integer> m=	nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(m);
	
	}

}
