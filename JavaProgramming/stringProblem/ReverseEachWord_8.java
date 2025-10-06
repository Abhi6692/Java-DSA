package stringProblem;
public class ReverseEachWord_8 {
  
    	public static void main(String[] args) {
            String string = "Hello World Java";

            String[] words = string.split(" ");
            String finalString = "";

            // Loop through each word using enhanced for loop
            for(String word : words) {
            	
                String reversedWord = "";
                
                // Reverse each word character by character
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord = reversedWord + word.charAt(i);
                }

                // Append reversed word to the final string
                finalString = finalString + reversedWord + " ";
            }

            // Trim extra space and print result
            System.out.println("The reverse of each word of the string \"" + string + "\" is --> " + finalString.trim());
        }
}
