package com.techment.assignment;

import java.util.Random;
import java.util.Scanner;

public class CompareTwoRandomNumbers {

	public static void main(String[] args) {


		Random  random = new Random();
		int numb1 = random.nextInt();
		
		System.out.println("Enter Your guess number :");
		Scanner scanner = new Scanner(System.in);
		int  numb2 = scanner.nextInt();
		
		
		if(numb1==numb2)
		{
			System.out.println("Random numbers were same");
		}
		else
			System.out.println("Random numbers were different");
		

	}

}
