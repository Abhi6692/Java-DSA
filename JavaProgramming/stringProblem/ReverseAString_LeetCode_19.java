package stringProblem;

/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Solution - You can reverse the array in-place using a two-pointer approach — one pointer starting at the beginning of 
the array and the other at the end, swapping elements until they meet.
*/


public class ReverseAString_LeetCode_19 {

	public static void reverseString(char[] s) {
		
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            // Move pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
       
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(s1);  // Output: olleh
    }
}
