package com.techment.states;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class States {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		LinkedHashSet<String> stateSet = new LinkedHashSet();
		Set<String> data = new LinkedHashSet<String>();

		FileReader fr = new FileReader(
				"C:\\Users\\hp\\Desktop\\Techment\\Collection Assignment\\bin\\com\\techment\\states\\states.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {

			stateSet.add(line);
			data.add(line);
			line = br.readLine();
		}

		System.out.println("Total number of states is :" + stateSet.size());

		stateSet.remove("Delhi");

		System.out.println("Name starting with k ");

		for (String b : stateSet) {
			if (b.startsWith("K"))
				System.out.println(b);
		}
		ArrayList<String> array = new ArrayList<String>(stateSet);
		Collections.sort(array);

		System.out.println(array);

		br.close();
	}

}
