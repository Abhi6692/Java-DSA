package arraysProblem;

import java.util.*;

public class FindAllMissingNumbers_10B{
    public static void main(String[] args) {
    	
        int[] arr = {10, 11, 13, 15, 17,19};  // Input array with missing numbers: 12, 14, 16

        // Step 1: Create a Set to store all elements from the array for fast lookup
        Set<Integer> numberSet = new HashSet<>();

        // Step 2: Initialize min and max with the first element of the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Step 3: Populate the set and find the minimum and maximum number in the array
        for (int num : arr) {
            numberSet.add(num);  // Add the number to the set

            // Update min and max while iterating
            if (num < min) {
            	
            	min = num;
            	}
            
            if (num > max) {
            	
            	max = num;
            	}
        }

        // Step 4: Check for missing numbers in the range from min to max
        System.out.print("Missing numbers: ");
        boolean foundMissing = false;

        for (int i = min; i <= max; i++) {
            // If number is not in the set, it's missing
            if (!numberSet.contains(i)) {
                System.out.print(i + " ");
                foundMissing = true;
            }
        }

        // Step 5: If no missing number was found, print 'None'
        if (foundMissing==false) {
            System.out.println("None");
        }
    }
}

