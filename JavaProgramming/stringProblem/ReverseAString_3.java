package stringProblem;

import java.util.Stack;

public class ReverseAString_3 {

	//Traditional Approach
	public static void revStringUsingbackwardTravesal(String string) {

		String rev = "";

		for(int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}

		System.out.println("The String reverse or the given string <" + string + ">" + " is -->  " + rev);
	}

	//Using Stack
	public static void stringReverseUsingStack(String str) {
		StringBuilder rev = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		// Push all characters onto the stack
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}

		// Pop all characters from the stack and append to StringBuilder
		while (!stack.isEmpty()) {
			rev.append(stack.pop());
		}
		
		System.out.println(rev);
	}
	public static void main(String[] args) {
		revStringUsingbackwardTravesal("RONY");
		stringReverseUsingStack("ABHI");

	}
}
