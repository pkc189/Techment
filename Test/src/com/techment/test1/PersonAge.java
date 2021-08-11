package com.techment.test1;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// Taking input from user , number of persons
		System.out.println("How many person you wants to calculate :");
		int person = scanner.nextInt();
		
		
		int age [] = new int[person];
		
		
		// Taking age of each person using for loop 
		
		for(int i=0 ; i<person;i++)
		{
			System.out.println("Enter the age of "+(i+1)+" person ");
			age[i] = scanner.nextInt();
			
		}
		
		
		// Counting all ages
		
		int children=0,adult = 0,seniorCitizen=0;
		
		for(int i=0; i<age.length;i++)
		{
			if(age[i]<18)
				children++;
			else if (age[i]>=18 && age[i]<=54)
				adult++;
			else 
				seniorCitizen++;
			
		}
		
		// Displaying output
		System.out.println();
		System.out.println("Children : "+children);
		System.out.println("Adult : "+adult);
		System.out.println("Senior Citizen : "+seniorCitizen);
		
	}

}
