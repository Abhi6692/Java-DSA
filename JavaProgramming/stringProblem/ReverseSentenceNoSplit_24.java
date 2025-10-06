package stringProblem;

public class ReverseSentenceNoSplit_24 {
	
	/*
	 * Problem Statement - Reverse a Sentence without Using Split Function 
	 * 
	 * Solution:
	 *  
	 *  The easiest way is:
	 * 
	 * 1.Traverse the string from the end to the beginning.
	 * 
	 * 2.Collect each word by detecting spaces.
	 * 
	 * 3. Append words into a new sentence.
	 */

	
	public static void sentenceRev(String str) {
		
		String result = "";
		
        String word = "";

        // Traverse backward
        for (int i = str.length() - 1; i >= 0; i--) {
        	
            
            //If it’s a space ' ' - That means we finished reading one word.
            if (str.charAt(i) == ' ') {
            	
                //append that word to the final result, add a space, and reset word to empty so we can start building the next word.
                result = result + word + " ";
                word = "";
                
            }
            
            else {
            	
                // build word in reverse order
                word = str.charAt(i) + word ;
            }
        }

        // Add last word
        result = result + word;

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
		
	
	
	
	
    public static void main(String[] args) {
        
    	sentenceRev("I am happy Boy");
    }
}
