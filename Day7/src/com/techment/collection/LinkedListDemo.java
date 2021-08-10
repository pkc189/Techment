package com.techment.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ol = new LinkedList();
		ol.add(1);
		ol.add(2);
		ol.addFirst(3);
		ol.addFirst(7);
		ol.add(4);
		
		ol.removeLast();
		
		System.out.println(ol);
	}

}
