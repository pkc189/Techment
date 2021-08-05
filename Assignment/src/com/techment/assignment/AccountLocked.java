package com.techment.assignment;

import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int correctPin = 12345;
   
   int i =1,pin=0;
   Scanner scanner = new Scanner(System.in);
   
   while(pin!=correctPin)
   {
	   System.out.println("Enter Pin ");
	   pin = scanner.nextInt();
	   
	   if(pin==correctPin)
		   System.out.println(" PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
	   if(i==3 )
	   {
		   System.out.println(" YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
		   break;
	   }
	   
	   i++;
   }
	}

}
