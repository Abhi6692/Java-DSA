package arraysProblem;
import java.util.HashSet;
import java.util.Set;

/*Problem:
Given an array of integers nums and an integer target, 
determine whether there exists a pair of numbers in the array whose sum is equal to the given target.

Return true if such a pair exists, otherwise return false.*/


public class TwoSum_17A { //Return true or false
	
    public static boolean hasPairWithSum(int[] nums, int target) {
        
    	Set<Integer> set = new HashSet<>();
    	

        for (int num : nums) {
        	
        	
			/*
			 * For the current number num, we calculate the complement that would be needed
			 * to reach the target.
			 * 
			 * Example: If target = 5 and num = 2, then complement = 5 - 2 = 3.
			 * 
			 * So we’re looking for a number 3 that we've already seen.
			 */        	
            int complement = target - num;
            
            if (set.contains(complement)) {
                return true; // Found a pair
            }
            else {
            	set.add(num);
            }
            
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int target1 = -2;
        System.out.println(hasPairWithSum(arr1, target1));  // Output: true

        int[] arr2 = {1, -2, 1, 0, 5};
        int target2 = 0;
        System.out.println(hasPairWithSum(arr2, target2));  // Output: false
    }
}
