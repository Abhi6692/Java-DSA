package generalProgramming;

public class FactorialCalculator_2 {

    // Method to calculate factorial
	/*
	 * How it evaluates factorial(0): When number = 0:
	 * 
	 * The loop for (int i = 1; i <= number; i++) does not run because 1 <= 0 is
	 * false.
	 * 
	 * So the initial value of result = 1 is not changed.
	 * 
	 * Therefore, the method returns 1, which is mathematically correct.
	 */
	
	
	
	/*
	 * Time Complexity: The for loop runs from 1 to number, so it executes number
	 * times.
	 * 
	 * Each iteration performs a single multiplication: result = result * i;
	 * 
	 * 👉 Time complexity = O(n), where n is the input number.
	 */
	
	/*
	 * ✅ Space Complexity: The method uses only a constant amount of memory:
	 * 
	 * One variable result (long)
	 * 
	 * The loop counter i
	 * 
	 * No additional memory is used that depends on n.
	 * 
	 * 👉 Space complexity = O(1) (constant space)
	 */
    public static long findFactorial(int number) {
        long result = 1;

        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
    
    
    
 // Recursive method to calculate factorial
    public static long findFactorialrecursive(int number) {
    	
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        if (number == 0 || number == 1) {
            return 1;
        }
        
        return number * findFactorialrecursive(number - 1);
    }
    

    // Main method for testing
    public static void main(String[] args) {
      ;
        System.out.println("Factorial is: " + findFactorial(3));
    }
}
