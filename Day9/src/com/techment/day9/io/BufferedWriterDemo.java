package com.techment.day9.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("pk.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("6 Aug 2025 ");
		
		char[] ch = {'a','b','c'};
		
		bw.write(ch);
		bw.write(" Reactjs Java ExpressJS NodeJS");
		bw.close();
		
	}

}
