package com.techment;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 4, 3, 5, 3, 7, 5, 9, 12, 3, 4, 8, 9, 7, 9 };

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(0, "Pankaj");
		hmap.put(1, "Java");
		hmap.put(3, "Hello");

		System.out.println(hmap);

	}

}
