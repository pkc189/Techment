package com.stream.practice;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list =   Arrays.asList("Pk","Cse");
		
		
		boolean ans = list.stream().noneMatch(a->a.length()>4);
		
		System.out.println(ans);
		
	}

}
