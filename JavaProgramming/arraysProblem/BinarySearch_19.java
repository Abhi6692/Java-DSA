package arraysProblem;

/*
 * 
 * Problem Statement --> Given an array of integers nums which is sorted in ascending order, 
 * and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * 
 * 
Binary Search Concept:
Start with two pointers: left = 0 and right = nums.length - 1.

Calculate the middle index: mid = left + (right - left) / 2.

If nums[mid] == target, return mid.

If  target > nums[mid] , search the right half (left = mid + 1).

If target < nums[mid] , search the left half (right = mid - 1).

Repeat until left > right.

If not found, return -1.
*/





public class BinarySearch_19 {
	
	public static int search(int[] nums, int target) {
        
		 // Step 1: Initialize two pointers with the index of the first and last element.
        int left = 0;
        int right = nums.length - 1;

        // Step 2: Loop until the search space is exhausted
        while (left <= right) {
            
            // Step 3: Find the middle index (avoids overflow)
            int mid = left + (right - left) / 2;

            // Step 4: Check if the middle element is the target
            if (target == nums[mid]) {
                return mid; // Target found
            } 
            // Step 5: If target is greater, ignore the left half
            else if (target > nums[mid]) {
                left = mid + 1; // Search in the right half
            } 
            // Step 6: If target is smaller, ignore the right half
            else if (target < nums[mid]) {
                right = mid - 1; // Search in the left half
        }

        
    }
     // Step 7: Target not found
        return -1;
	}
    // Example usage
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9, 12};
        int target = 90;
        int result = search(nums, target);
        System.out.println("Index of " + target + ": " + result); // Output: 4
    }

}



/* Types of Search Techniques - Linear Search (Sequential Search), Binary Search , Exponential Search , Hashing , Fibonacci Search etc
 * 
 * 
 * 
 	1. Linear Search (Sequential Search)

	How it works: Check each element one by one until you find the target or reach the end.

	Use case: Works on unsorted or small lists.

	Time Complexity: O(n)	
	
	
	2. Binary Search

	How it works: 
	Only works on sorted data.

	Start with the middle element.

	If the target is smaller → search the left half.

	If larger → search the right half.

	Repeat until found or interval is empty.
	
	Time Complexity: O(log n)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

