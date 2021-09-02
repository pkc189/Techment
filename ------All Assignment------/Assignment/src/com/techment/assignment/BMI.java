package com.techment.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class BMI {

	
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter Height in Meters: ");
		float height = scanner.nextFloat();
		
		System.out.print("Enter Weight in Kg: ");
		float weight = scanner.nextFloat();
		
	      float bmi = weight/(height*height);
	      
	      
	      if(bmi<18.5)
	    	  System.out.println("Underweight");
	      else if(bmi>=18.5 && bmi<=25)
	    	  System.out.println("Normal");
	      else if(bmi>25 && bmi<=30)
	    	  System.out.println("Overweight");
	      else
	    	  System.out.println("Obese");
	    	  


	}

}
