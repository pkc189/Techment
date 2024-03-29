package com.practice.stream;

import java.util.*;

public class AnyMatch {
      
    // Driver code
    public static void main(String[] args) {
          
    // Creating a list of Integers
    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
   
    // Stream anyMatch(Predicate predicate) 
    boolean answer = list.stream().anyMatch(n
                     -> (n * (n + 1)) / 4 == 5);
      
    // Displaying the result
    System.out.println(answer);
}
}