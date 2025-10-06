package generalProgramming;
//WAP to print first 10 numbers in fibonacci series 

//The Fibonacci series is a sequence of numbers where each number 
//is the sum of the two preceding ones, starting from 0 and 1.

public class FibonacciNumbers_10 {
	
	public static void fibonaccinumbers() {
	    int a = 0;  // First Fibonacci number
	    int b = 1;  // Second Fibonacci number

	    for (int i = 0; i < 10; i++) {  // Loop to generate 10 numbers
	        int c = a + b;  // Compute the next Fibonacci number
	        
	        System.out.println(c);  // Print the Fibonacci number
	        
	        a = b;  // Move 'a' to the next number
	        b = c;  // Move 'b' to the next number
	    }
	}


   public static void main(String[] args) {
      fibonaccinumbers();
   }
}
