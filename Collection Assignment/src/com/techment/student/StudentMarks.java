package com.techment.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of Students :");
		int students = scanner.nextInt();

		ArrayList<Integer> marks = new ArrayList<Integer>(students);

		int sum = 0;
		for (int i = 0; i < students; i++) {
			System.out.println("Enter marks ");

			int numb = scanner.nextInt();

			marks.add(numb);

			sum += numb;

		}

		System.out.println();
		System.out.println("Highest marks " + Collections.max(marks));

		System.out.println("Average marks " + (sum / students));

		for (int i = 0; i < marks.size(); i++) {
			System.out.print("marks " + i + " " + marks.get(i) + " ");

		}
		System.out.println();
		System.out.println("3rd Index ");
		System.out.println(marks.get(2));

		Collections.sort(marks);

		Iterator<Integer> it = marks.iterator();

		System.out.println("After Sorting ");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		scanner.close();

	}

}
