package stringProblem;

public class PatternCount_21 {

    // Method to count pattern occurrences in the input string
    public static int countPatternOccurrences(String str, String pattern) {
        
    	
    	int count = 0;

        // Convert to lowercase for case-insensitive matching
        str = str.toLowerCase();
        pattern = pattern.toLowerCase();

        //This for loop starts at index 0 and goes up to a point where a full pattern substring 
        //can still be extracted without crossing the string's end.
        
        for (int i = 0; i <= str.length() - pattern.length(); i++) {
        	
           
        	if (str.substring(i, i + pattern.length()).equals(pattern)) {
                count++;
            }
        }

        return count;
  
    }
    
    
    public static void main(String[] args) {
        String input = "Abacbaabcacbacbacbacbacbabc";
        String pattern = "abcd";

        int count = countPatternOccurrences(input, pattern);
        System.out.println("Count of pattern '" + pattern + "': " + count);
    }
}

