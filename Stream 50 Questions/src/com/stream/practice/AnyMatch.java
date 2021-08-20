package com.stream.practice;
import java.util.*;


public class AnyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,4,5,6,7);
		
	    boolean b =  list.stream().anyMatch(a->a==5); //boolean 
	    System.out.println(b);
		
		
		
	}

}
