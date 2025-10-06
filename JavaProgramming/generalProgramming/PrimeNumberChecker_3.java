package generalProgramming;
public class PrimeNumberChecker_3 {

    // Function to check if the number is prime
    public static boolean isPrime(int num) {
        // Check if num is less than 2 (prime numbers must be greater than 1)
        if (num <= 1) {
            return false;
        }
        
		/*
		 * // Why not check from 2 to num? 
		 * 
		 * Checking up to num is unnecessary.
		 * 
		 * Because every number is divisible by itself.
		 * 
		 * We're only interested in checking if it’s divisible by other numbers (not 1
		 * and not itself).
		 * 
		 * That's why the loop goes up to num - 1, to avoid the trivial divisor.
		 */        
        
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
                
            }
        }
        
        return true; // num is prime
    }

    public static void main(String[] args) {
        int num = 29; // Example number
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
