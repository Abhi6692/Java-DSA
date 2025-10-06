package stackProblems;


/*
 * Given a string s representing an expression containing various types of brackets:  
 * {}, (), and [], the task is to determine whether the brackets in the expression are balanced or not. 
 * A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.

Example: 

Input: s = "[{()}]"
Output: true
Explanation:  All the brackets are well-formed.

Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.

Input: s = "([]"
Output: false
Explanation: The expression is not balanced as there is a missing ')' at the end.

Input:  s = "([{]})"
Output: false
Explanation: The expression is not balanced because there is a closing ']' before the closing '}'.*/

import java.util.Stack;

public class ValidParenthesis_1 {

    public static boolean isBalanced(String s) {
    	
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // Push opening brackets to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            
            // For closing brackets, check for matching opening
            else if (ch == ')' || ch == '}' || ch == ']') {
                
            	if (stack.isEmpty()) {
                	return false; // Nothing to match
                	} 

                char last = stack.pop(); // Get the last opened bracket

                // Check if it matches the current closing bracket
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false; // Mismatch
                }
            }
        }

        // If stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{([])}"));     // true
        System.out.println(isBalanced("[()()]{}"));   // true
        System.out.println(isBalanced("([]"));        // false
        System.out.println(isBalanced("([{]})"));     // false
    }
}

