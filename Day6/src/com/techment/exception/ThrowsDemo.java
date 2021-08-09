package com.techment.exception;

import java.io.FileNotFoundException;

class Student
{
	void checkEligiblity(int age) throws FileNotFoundException{
		if(age>=18)
			System.out.println("You can apply for loan");
		else 
			throw new FileNotFoundException("You can apply for loan");
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
  
		Student student = new Student();
		student.checkEligiblity(15);
	}

}
