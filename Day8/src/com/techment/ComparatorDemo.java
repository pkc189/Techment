package com.techment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}


class AgeSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age>o2.age)
			return 1;
		else 
			return -1;
		
		
		
	}
	
}


class NameSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.name.compareTo(o2.name));
		
		
		
	}
	
}



public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Student> stud1 = new ArrayList<Student>();
		
		stud1.add(new Student(1,"pankaj",21));
		stud1.add(new Student(2,"rahul",29));
		stud1.add(new Student(3,"ankit",27));
		
		System.out.println("Before sorting");
		for(Student s:stud1)
			System.out.println(s);
		
		
		System.out.println("\n Sorting");
		
		
		Collections.sort(stud1,new AgeSorting());
		
		for(Student s:stud1)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
