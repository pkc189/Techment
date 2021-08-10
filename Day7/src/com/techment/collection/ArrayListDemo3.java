package com.techment.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		
		o1.add(1);
		o1.add(3);
		o1.add(7);
		
		System.out.println(o1);
		
		
ArrayList<Integer> o2 = new ArrayList<Integer>();
		
        o2.add(3);
		o2.add(100);
		o2.add(233);
		o2.add(127);
//		o2.addAll(o1);
//		o2.removeAll(o1);
		
		Collections.sort(o2);
		//o2.retainAll(o1);
		
		
		System.out.println(o2);
		
		
	}

}
