package com.techment.assignment;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SortWordsOfSentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Sentence ");
		Scanner scanner = new Scanner(System.in);
		
		String msg = scanner.nextLine();
		  
		
		String[] arrOfStr = msg.split(" ",0);
		
		
		Arrays.sort(arrOfStr);
	
		
		 for (String a : arrOfStr)
	            System.out.println(a);
	}

}
