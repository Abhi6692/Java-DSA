package generalProgramming;

/*An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own 
digits each raised to the power of the number of digits.

Example:

153 is an Armstrong number because:

153 = 1*1*1 + 5*5*5 + 3*3*3	

 */



public class ArmstrongNumberChecker_11 {

	public static boolean isArmstrong(int num) {

		int originalNum = num;
		int result = 0;
		int digits = String.valueOf(num).length(); // Count the number of digits

		while (num != 0) {
			int lastdigit = num % 10; // Extract last digit
			result += Math.pow(lastdigit, digits) ; // Raise it to the power of digits and add
			num /= 10; // Remove last digit
		}

		if (result == num) {
			return true;
		} else {
			return false;
		}
	}



	public static void main(String[] args) {
		int number = 153;  // You can change this value

		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
}

