package arraysProblem;

import java.util.HashSet;
import java.util.Set;

/*
 Problem Statement: Given an integer array nums, return true if any value appears at least twice in the array, 
 and return false if every element is distinct.

Example:

Example 1:
Input: nums = [1, 2, 3, 1]
Output: true.
Explanation: 1 appeared two times in the input array.

Example 2: 
Input: nums = [1, 2, 3, 4]
Output: false
Explanation: input array does not contain any duplicate number. */


public class ContainsDuplicate_20 {

	public static boolean containsDup(int [] nums) {
		
		Set<Integer> seen = new HashSet<Integer>();
		
		for(int num : nums) {
			if(seen.contains(num)) {
				return true;
			}
			
			else {
				seen.add(num);
			}
		}
		
		return false;
	}
	
	

	
	public static void main(String[] args) {
		
		System.out.println(containsDup(new int [] {1,2,12,3,4}));
	}

}
