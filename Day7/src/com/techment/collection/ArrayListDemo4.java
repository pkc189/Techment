package com.techment.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("sachin");
		batch1.add("ravi");
		batch1.add("kumar");
		batch1.add("sowmya");
		System.out.println("Batch 1" +batch1);
		
		ArrayList<String> batch2 = new ArrayList<String>();
		batch2.add("sourabh");
		batch2.add("manish");
		batch2.add("sachin");
		batch2.add("ankit");
		batch2.add("kumar");
		
		System.out.println("Batch 2" +batch2);
		
		// Merging in batch2 collection
		batch2.addAll(batch1);
		
		System.out.println("After merging "+batch2);
		
		//Remove duplicated
		
		 ArrayList<String> newList = new ArrayList<String>();
		  
	        // Traverse through the first list
	        for (String element : batch2) {
	  
	            // If this element is not present in newList
	            // then add it
	            if (!newList.contains(element)) {
	  
	                newList.add(element);
	            }
	        }
		
		System.out.println("Without Duplicates "+newList);
		
		// Sorting Collection
		
		Collections.sort(newList);
		
		
		System.out.println("After sorting "+newList);
		
		
		
		
	}

}
