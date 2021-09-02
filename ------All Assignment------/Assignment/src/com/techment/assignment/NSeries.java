package com.techment.assignment;
import java.util.Scanner;

public class NSeries {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter num: ");
			int num = sc.nextInt();
			
			for(int i = 1;i<=num;i++)
				System.out.print(Math.pow(i, 3)+" ");
			
		}
		finally {
			sc.close();
		}


	}

}

