package stringProblem;


//A word is considered capitalized if its first letter is an uppercase letter.


public class CapitalizedWordCounter_10 {
	
	
	public static void countCapitalizedWords(String str) {
        int count = 0;

        // Split the string into words
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > 0 && Character.isUpperCase(word.charAt(0))) {
                count++;
            } }
        
        System.out.println(count);
        }
	
	
	
	
	
	
	
	
	
    public static void main(String[] args) {
    	
       

        
    }
}

