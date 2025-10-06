package generalProgramming;


/*A palindrome number is a number that remains the same when its digits are reversed. 
In other words, a number is a palindrome if it reads the same forwards and backwards.*/

public class PalindromeNumber_5 {
   public static void isPalindrome(int num) {
      int originalNum = num;

   // Edge case: Single digit numbers are always palindromes
      if (num >= -9 && num <= 9) {
          System.out.println("The Number is Palindrome (Single Digit)");
          return;  // No need to reverse single-digit numbers
       }
      
      int reversedNum = 0;

      while (num != 0) {
          int lastDigit = num % 10;  // Extract last digit
          reversedNum = (reversedNum * 10) + lastDigit;  //Build reversed number
          num = num / 10;  // Remove last digit
      }

   // Check if the original number is equal to the reversed number
      if (reversedNum == originalNum) {
         System.out.println("The Number is Palindrome");
      } else {
         System.out.println("The number is not palindrome");
      }

   }

   public static void main(String[] args) {
      isPalindrome(1);
   }
}
