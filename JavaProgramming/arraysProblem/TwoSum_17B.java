package arraysProblem;

/*
Given an array of integers nums and an integer target,  
return "indices of the two numbers" such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
import java.util.HashMap;*/


import java.util.Map;
import java.util.HashMap;

public class TwoSum_17B { 
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	//Use a HashMap to Store Visited Numbers - Number(Key) mapped to their Index (Value)
    	
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	
        	//For each element, calculate the complement: What number do I need to pair with nums[i] to reach the target?
            int complement = target - nums[i];
            
            
            
            if (map.containsKey(complement)) {
            	
                return new int[] { map.get(complement), i };  //return new int[] { complement, nums[i] } --> If we need to return the numbers 
                
				/*
				 * This checks:
				 * 
				 * "Is the number I’m looking for (the complement) already in the map?"
				 * 
				 * If yes, it means:
				 * 
				 * That number was already visited in a previous iteration - You already saved its index in the map.
				 
				 * So now you’ve found a pair that adds up to the target:
				 * 
				 * Current number: nums[i]
				 * 
				 * Previous number: complement, which is stored in the map
				 */
            }
            else {
            	 map.put(nums[i], i); //This line adds the current number (nums[i]) and its index (i) to the HashMap.
            }
           
        }
        
        // Problem guarantees one solution, but in case of invalid input:
        throw new IllegalArgumentException("No two sum solution");
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
