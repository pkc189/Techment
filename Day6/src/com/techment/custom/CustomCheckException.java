package com.techment.custom;

class LateException extends Exception{
	public LateException(String msg) {
		super(msg);
	}
}


class Student{
	void login(int time) throws LateException
	{
		if(time>9)
			throw new LateException("you are absent");
		else
			System.out.println("You are Present");
	}
}


public class CustomCheckException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Student student = new Student();
	 try {
			student.login(10);
	 }catch(Exception a)
	 {
		 System.out.println(a.getMessage());
	 }
		
	}

}
