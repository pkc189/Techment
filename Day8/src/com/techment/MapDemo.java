package com.techment;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("sachin", "p");
		
		// for printing both key values
		for(Entry<String, String> e :hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
		// for printing only val
		for(String val:hm.values())
		{
			System.out.println(val);
		}
		
		
		
		
		
	}

}
