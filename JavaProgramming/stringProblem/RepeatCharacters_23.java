package stringProblem;

public class RepeatCharacters_23 {

	
	public static void repeatCharacters(String input) {
		
		char[] chars = input.toCharArray(); // convert string to char array
		
	    String number = "";

	    for (char ch : chars) { // enhanced for loop through char array
	        if (Character.isDigit(ch)) {
	            // collect digits
	            number += ch;
	        } else {
	            // repeat the character based on collected number
	            int count = Integer.parseInt(number);
	            for (int j = 0; j < count; j++) {
	                System.out.print(ch);
	            }
	            System.out.println(); // new line
	            number = ""; // reset
	        }
	    }
	}

	public static void main(String[] args) {
		repeatCharacters("3s5h10d1k");

	}

}
