package generalProgramming;

public class SumOfDigits_9{


	public static int calculateDigitSum(int number) {

		
		number = Math.abs(number);  // Handle negative numbers
		
		if (number >=-9 && number <=9) {
			
			return number; //Sum of Single digit number is Same as the number
		}
		
		

		int digitsum = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			digitsum = digitsum +  lastDigit;
			number /= 10;
		}

		return digitsum;
	}



	public static void main(String[] args) {

		
		int num = 0012;
		
		int digitSUm = calculateDigitSum(num);
		System.out.println(digitSUm);
	}
}
