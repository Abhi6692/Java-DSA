package generalProgramming;

//The FizzBuzz problem is a classic programming exercise 
//that tests basic logic, loops, and condition handling.


//Problem Statement
//Write a program that prints numbers from 1 to N (usually 100), following these rules:
// 1. If the number is divisible by 3, print "Fizz" instead of the number.
// 2. If the number is divisible by 5, print "Buzz" instead of the number.
// 3. If the number is divisible by both 3 and 5, print "FizzBuzz".
// 4. Otherwise, print the number itself.

public class FizzBuzz_12 {
	
   public static void fizzBuzz(int n) {
	   
      for(int i = 1; i <= n; ++i) {
         if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
            System.out.println("Fizz");
         } else if (i % 5 == 0) {
            System.out.println("Buzz");
         } else {
            System.out.println(i);
         }
      }

   }

   public static void main(String[] args) {
      fizzBuzz(50);
   }
}
