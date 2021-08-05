package com.techment.task;

import java.util.Arrays;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

     System.out.print("How many marks you want to entered ");
     Scanner scanner = new Scanner(System.in);
     
     boolean pass = true;
     
     
     // Taking input of marks
     
     int number = scanner.nextInt();
     
     float marks[] = new float[number];
     
     for(int i=0; i<marks.length; i++)
     {    System.out.print("enter "+(i+1)+" marks ");
    	 float n = scanner.nextFloat();
    	 marks[i]=n;
    	 
    	 if(n<40)
    		 pass=false;
    	 
     }
     
     // Printing all marks
     
     System.out.println();
     
     System.out.println("Your all marks are : ");
     for(int i=0; i<marks.length; i++)
     {
    	 System.out.println("1st subject marks "+marks[i]);
    	 
     }
     
     
    // Total marks
     
     float sum = 0;
     for(int i=0; i<marks.length; i++)
     {

        sum+=marks[i]; 
        
     }
     System.out.println("Your total marks are : "+sum);
     
     
   // Lowest & Highest marks
     
     Arrays.sort(marks);
     
     System.out.println("Lowest marks is "+marks[0]);
     System.out.println("Highest marks is "+marks[marks.length-1]);
     
     
     // Second Highest marks 
     
     System.out.println("Second Highest marks is "+marks[marks.length-2]);
     
     // Pass or fail
     
     if(pass)
    	 System.out.println("You are Pass");
     else
    	 System.out.println("Fail");
     

	}

}
