package com.techment.day13;

@FunctionalInterface
interface A
{
	Student getStudentDetails();
}


public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is by lambda exp
		A a = ()-> new Student();
		a.getStudentDetails().display();
		
		
		//by using method ref
		A  obj = Student::new;
		obj.getStudentDetails().display();
	}

}
