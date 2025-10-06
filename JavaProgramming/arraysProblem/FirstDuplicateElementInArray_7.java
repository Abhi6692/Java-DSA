package arraysProblem;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElementInArray_7 {
	public static void main(String[] args) {

		int numbers [] = {14,4,14, 121,4, 15, 12, 13, 141};

		// Create a HashSet to store elements we've seen so far
		Set<Integer> seen = new HashSet<Integer>();

		// Iterate through each number in the array		  
		for (int i = 0 ; i <numbers.length; i++) {

			// If the number is already in the set, it's a duplicate

			if(seen.contains(numbers[i])){
				System.out.println("The first duplicate is " + numbers[i]);
				return; // Exit after finding the first duplicate
			}

			// Otherwise, add the number to the set
			else {

				seen.add(numbers[i]);
			}


		}	  

		// If no duplicates are found, print this
		System.out.println("No duplicate elements found.");

	}
}
