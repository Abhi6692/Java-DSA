package javaStreams;

import java.util.Arrays;
import java.util.List;

public class Sum_6 {
	
  public static void main(String[] args) {
	  
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        //using arithmetic operation
	        int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);

	        System.out.println("Sum1: " + sum1);
	        
	        System.out.println("====================");
	        
	        //using method reference
	        int sum2 = numbers.stream().reduce(0, Integer::sum);
	        System.out.println("Sum2: " + sum2);
	        
	        System.out.println("====================");
	        
	      
	        
	    }
	}


