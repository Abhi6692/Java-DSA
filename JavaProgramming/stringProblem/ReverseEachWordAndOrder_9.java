package stringProblem;

public class ReverseEachWordAndOrder_9 {
    public static void main(String[] args) {
        String input = "Hello World Java";  // Input string

        String[] words = input.split(" ");  // Step 1: Split the input string into words using space as delimiter
        String finalString = "";           // Step 2: To store the final result

        // Step 3: Traverse the words array in reverse order (to reverse the word order)
        for (int i = words.length - 1; i >= 0; i--) {
            String reversedWord = "";     // Step 4: Initialize an empty string to store the reversed word
            String word = words[i];       // Step 5: Get the word at current index

            // Step 6: Reverse the characters of the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord+ word.charAt(j); // Append characters in reverse order
            }

            // Step 7: Add the reversed word to the final string
            finalString = finalString +reversedWord + " ";
        }

        // Step 8: Print the final string after trimming the trailing space
        System.out.println("Reversed each word and word order: " + finalString.trim());
    }
}

