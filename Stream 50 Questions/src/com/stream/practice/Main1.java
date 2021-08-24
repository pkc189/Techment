package com.stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main1
{
	// Method to find a maximum element from a list using the stream in Java 8 and above
	public static int getMax(List<Integer> list)
	{
		return list.stream().collect(Collectors.summingInt(Integer::intValue));
			
			
	}

	public static void main (String[] args)
	{
		//List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 6, 5, 9, 1));
		List<Integer> list = Arrays.asList(4, 2, 6, 5, 9, 1);
		System.out.println("Maximum element is " + getMax(list));
	}
}