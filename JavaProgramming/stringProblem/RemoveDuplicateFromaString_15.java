package stringProblem;

public class RemoveDuplicateFromaString_15 {

	
	
	    public static void main(String[] args) {
	        
	    	String input = "aabccdee";
	        
	    	String result = "";

	        for (int i = 0; i < input.length(); i++) {
	        	
	        	
	             // Add character only if it's not already in result
	            if (result.indexOf(input.charAt(i)) == -1) {
	                result = result +  input.charAt(i);
	            }
	        }

	        System.out.println("Original: " + input);
	        System.out.println("Without duplicates: " + result);
	    }
	}


