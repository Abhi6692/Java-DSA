package stringProblem;

public class ReverseWithoutChangingDigitsTwoPointers_22 {
	
	
	
    public static String reversePreservingDigits(String input) {
    	
        // Convert input string to character array for in-place swapping
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int left = 0;
        int right = chars.length - 1;

        // Loop until the two pointers meet or cross
        while (left < right) {
        	
            // Skip digits from the left side
            if (Character.isDigit(chars[left])) {
                left++;
            }
            
            // Skip digits from the right side
            else if (Character.isDigit(chars[right])) {
                right--;
            }
            
            // Both chars are non-digits, so swap them
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                // Move both pointers inward
                left++;
                right--;
            }
        }

        // Convert char array back to string and return
        return new String(chars);
    }

    // Example usage
    public static void main(String[] args) {
        String input = "$e3r71v1ce3n60w";
        String output = reversePreservingDigits(input);
        System.out.println("Output: " + output);  // Output: u23sa
    }
}
