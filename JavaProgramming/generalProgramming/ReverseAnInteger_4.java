package generalProgramming;

public class ReverseAnInteger_4 {
	public static int reverseNumber(int num) {
		
		// Check if it's a single-digit number (positive or negative)
        if (num >= -9 && num <= 9) {
        	System.out.println("No reversal needed");
            return num; // No reversal needed
        }
		
		
        int reversedNum = 0;

        while (num != 0) {
            int lastDigit = num % 10;  // Extract last digit
            reversedNum = (reversedNum * 10) + lastDigit;  //Build reversed number
            num = num / 10;  // Remove last digit
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int number = -1012;
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reverseNumber(number));
    }
}
