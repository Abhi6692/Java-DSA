package stringProblem;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.*;

//Simple logic
//1. Break the string to char array
//2. Convert the array to list and the list to set. 




	public class ArrayToSetExample {
	    public static void main(String[] args) {
	        String[] array = {"apple", "banana", "apple", "orange"};

	        Set<String> set = new HashSet<>(Arrays.asList(array));

	        System.out.println(set);  // Output: [banana, orange, apple]
	    }
	}

