package arraysProblem;

//Write a Java Program to find the longest consecutive occurrence of integers in a given array.

public class LongestConsecutiveOccurence_13 {

	    public static void main(String[] args) {

	        // Input array
	        int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };

	        // Variable to track the current streak of consecutive numbers
	        int currentStreakLength = 0;

	        // Variable to store the maximum streak found so far
	        int longestStreakLength = 0;

	        // Iterate through the array until the second last element
	        for (int i = 0; i < arr.length - 1; i++) {

	            // Check if the current number and the next one are consecutive
	        	//Loops from the first element to the second-last, because we compare arr[i] with arr[i + 1]
	            if (arr[i] + 1 == arr[i + 1]) {
	                // If yes, increment the current streak count
	                currentStreakLength++;
	            } else {
	                // If not consecutive, reset the current streak counter
	                currentStreakLength = 0;
	            }

	            // Update the longest streak if the current streak is longer
	            // We add +1 because currentStreakLength counts the number of "gaps"
	            longestStreakLength = Math.max(longestStreakLength, currentStreakLength + 1);
	        }

	        // Print the final result
	        System.out.println("Longest adjacent consecutive sequence length: " + longestStreakLength);
	    }
	}



