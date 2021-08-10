package com.techment.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("sachin");
		batch1.add("ravi");
		batch1.add("kumar");
		batch1.add("sowmya");
		//System.out.println("Batch 1" +batch1);
		
		
		Iterator<String>itr=batch1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
