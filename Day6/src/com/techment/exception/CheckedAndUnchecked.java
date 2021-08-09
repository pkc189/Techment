package com.techment.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedAndUnchecked {

	public static void main(String[] args) 
	//throws FileNotFoundException
	{
		// TODO Auto-generated method stub
         
		//throw new ArithmeticException("Some thing went wrong");
		
		
		try {
			 throw new FileNotFoundException("file not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	 
	}

}
