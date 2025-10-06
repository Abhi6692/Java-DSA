package generalProgramming;
//Swapping the numbers without using the third variable

public class SwapTwoInteger_7 {
	public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swapping logic
        a = a + b;  // a = 10 + 20 = 30
        b = a - b;  // b = 30 - 20 = 10
        a = a - b;  // a = 30 - 10 = 20

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
