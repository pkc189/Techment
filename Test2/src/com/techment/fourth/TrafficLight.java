package com.techment.fourth;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1 for Red\nEnter 2 for Yellow\nEnter 3 for Green\n ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("ready");
			break;
			
		default:
			System.out.println("go");
			break;
		}
		
		
	}

}
