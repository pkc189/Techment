package com.techment.patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.TreeSet;



//
//4 – Patient List - Comparable and Comparator
//Create a class Patient with private instance variables patientId (int), name(String) and age(int). Include parameterized Constructor and Getters/Setters
//
//Create a class TestPatientList with a main method.
//•	Create 3 objects of patient and add to an ArrayList
//•	Sort the List based on Name which should be the natural order and display using for each loop
//•	Sort the List based on age which should be the alternate sorting order and display using Iterator
//•	Add all the objects in to a TreeSet and display the TreeSet
//•	Create a static method getPatientAge which accepts name of the patient and TreeSet of patient. Method should return the age of patient. Invoke this method in the main method.



class Patient {
	private int patientId;
	private String name;
	private int age;
	
	//Constructor
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	static void parentAge() {
		
	}
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

class NameSorting implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
		
	}
	
}


class AgeSorting implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()>o2.getAge())
			return 1;
		else 
			return -1;
	}
	
}



public class TestPatientList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Patient> patient = new ArrayList<Patient>();
		
		
		Patient p1 = new Patient(1,"Naveen",37);
		Patient p2 = new Patient(2,"Atif",23);
		Patient p3 = new Patient(3,"Jain",35);
		
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
	System.out.println("Name Sorting");
		Collections.sort(patient,new NameSorting());
		for(Patient p:patient)
		{
			System.out.println(p);
		}
		
		
		System.out.println("Age Sorting");
		Collections.sort(patient,new AgeSorting());
		for(Patient p:patient)
		{
			System.out.println(p);
		}
		
		
		TreeSet<Patient> ts = new TreeSet<Patient>(patient);
		


		
		
		
		
		
		
	}

}
