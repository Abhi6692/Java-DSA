package stringProblem;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_17 {

  //Time: O(n) 
//Space: O(k), where k is the size of the character set (at most 26 for lowercase letters
	
	
	/*
	 * HashSet<Character> set → Keeps track of unique characters in the current substring.
	 * 
	 * 
	 * start and end → Represent the sliding window: s[start ... end-1]
	 * 
	 * maxLength → Stores the length of the longest substring without repeating characters
	 * 
	 */
	public static int lengthOfLongestSubstring(String s) {
		
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;

        // Two pointers: start and end for the sliding window
        int start = 0, end = 0;

        while (end < s.length()) {
        	
            char ch = s.charAt(end); //Take the character at end index.

            // If character not in set, it's unique in current window
            if (!set.contains(ch)) {
                set.add(ch);// Add to set
                end++; // Move the right pointer
                
                maxLength = Math.max(maxLength, end - start); // Update max length //end - Start : This gives the current window size, i.
            } 
            
            else {
            	
                // If duplicate found, remove the leftmost character and move left pointer
                set.remove(s.charAt(start));
                start++; // Shrink the window from the left
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("geeksforgeeks")); // Output: 7
        System.out.println(lengthOfLongestSubstring("aaa"));           // Output: 1
        System.out.println(lengthOfLongestSubstring("abcdefabcbb"));   // Output: 6
    }
}
