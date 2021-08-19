package com.techment.five;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Person {
	private int id;
	private String age;

	public Person(int id, String age) {
		super();
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}

public class EligiblePerson {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		try {
			Map<Integer, String> allPersonsMap = new HashMap<Integer, String>();
			EligiblePerson obj = new EligiblePerson();

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter number of persons  ");
			int persons = scanner.nextInt();

			for (int i = 0; i < persons; i++) {
				System.out.println("Enter id of " + (i + 1) + " person");
				int id = scanner.nextInt();

				System.out.println("Enter dob in this format (DD/MM/YYYY) of " + (i + 1) + " person");
				String age = scanner.next();

				allPersonsMap.put(id, age);

			}
			
			
			List<Integer> allAge = obj.votersList(allPersonsMap);
			
			
			System.out.println("List of eligible list are ");
			 for (Integer s : allAge) {
		            System.out.println(s);
		        }
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	List<Integer> allAge = new ArrayList<Integer>();

	private List<Integer> votersList(Map<Integer, String> allPersonsMap) throws ParseException {

		 for (Entry<Integer, String> entry : allPersonsMap.entrySet())
			{
			 int today = new SimpleDateFormat("dd/MM/yyyy").parse("18/07/2021").getYear();
			 int yourAge = new SimpleDateFormat("dd/MM/yyyy").parse(entry.getValue()).getYear();
			 if(today-yourAge>=18)
			 {
				 allAge.add(entry.getKey());
			 }
			     
			}
		return allAge;
	}

}
