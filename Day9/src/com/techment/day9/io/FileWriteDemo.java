package com.techment.day9.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("abc.txt",true);
		
		fw.write("hejjjjjjjjjjjjjj \n");
		fw.write(92);
		fw.write(98);
		fw.close();
				
		
		
	}

}
