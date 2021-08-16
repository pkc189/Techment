package com.techment.day12.newfeature;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionalInterafce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> predicate = (num)->num>18;
		
		System.out.println(predicate.test(20));
		Predicate<String> strPredicate = (name)->name.contains("a");
		
		System.out.println(strPredicate.test("safan"));
	
		
		Function<Integer,Integer> function1 = (num1)->num1;
		Function<String,Integer> function2 =(name)->name.length();
		
		
		
		System.out.println(function2.apply("pankaj"));
		
	}

}
