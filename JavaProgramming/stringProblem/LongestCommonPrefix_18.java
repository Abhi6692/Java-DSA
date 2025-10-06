package stringProblem;

/*Given an array of strings arr[], the task is to return the longest common prefix among each and   
		every strings present in the array. If there’s no prefix common in all the strings, return “”.

Examples:

Input: arr[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
Output: “gee”
Explanation: “gee” is the longest common prefix in all the given strings: “geeksforgeeks”, “geeks”, “geeks” and “geezer”.

Input: arr[] = [“apple”, “ape”, “april”]
Output : “ap”
Explanation: “ap” is the longest common prefix in all the given strings: “apple”, “ape” and “april”.

Input: arr[] = [“hello”, “world”]
Output: “”
Explanation: There’s no common prefix in the given strings.
 */

/*Key Idea (Using Sorting):
After sorting the array of strings lexicographically, the first and last strings in the 
sorted array will be the most different.

So, the LCP of the first and last strings is guaranteed to be the LCP of the entire array.
 */


import java.util.Arrays;

public class LongestCommonPrefix_18 {

	public static String longestCommonPrefix(String[] arr) {
		
		// Step 1: If the array is null or empty, return an empty string
		if (arr == null || arr.length == 0) {

			return "";

		}

		// Step 2: Sort the array of strings lexicographically
		// This brings similar strings closer in order, and the first and last strings will show the maximum difference
		Arrays.sort(arr);

		// Step 3: Take the first and last strings from the sorted array
		// These will be the most different in terms of common prefix
		String first = arr[0];
		String last = arr[arr.length - 1];

		int i = 0; // Initialize a pointer for character comparison

		// Step 4: Compare characters of first and last strings
		// Continue while characters match and we don't go out of bounds
		while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
			i++; // Move to the next character
		}

		// Step 5: Return the common prefix (substring from 0 to i)
		// This is the longest common prefix shared by all strings
		return first.substring(0, i);
	}

	public static void main(String[] args) {
		// Test Case 1
		String[] arr1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(longestCommonPrefix(arr1)); // Output: "gee"

		// Test Case 2
		String[] arr2 = {"apple", "ape", "april"};
		System.out.println(longestCommonPrefix(arr2)); // Output: "ap"

		// Test Case 3
		String[] arr3 = {"hello", "world"};
		System.out.println(longestCommonPrefix(arr3)); // Output: ""
	}
}

