package com.techment.day12.newfeature;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("pankaj","naveen","rahul","dhoni","sunil");

names.stream().filter(singleName->!singleName.contains("a")).forEach(i->System.out.println(i));


		
	}

}
