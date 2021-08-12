package com.techment.day9.io;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  File file = new File("H:\\abc1");
  
  System.out.println(file.exists());
  
  //file.createNewFile();
  file.mkdir();
  System.out.println(file.exists());
	}

}
