package com.stream.practice;

import java.util.stream.Stream;

public class AnyMatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stream<String> stream =  Stream.of("ankaj","pk","pK","k");
		
// in anyMatch if any single elem satisfied the all are true	
		boolean ans = stream.anyMatch(a->Character.isUpperCase(a.charAt(0)));
		
		System.out.println(ans);
		
	}

}
