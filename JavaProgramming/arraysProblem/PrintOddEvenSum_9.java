package arraysProblem;

import java.util.ArrayList;
import java.util.List;

public class PrintOddEvenSum_9 {
	
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

       List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();

        // Separate numbers into even and odd lists
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        // Calculate sums
        int evenSum = 0;
        int oddSum = 0;

        for (int even : evenList) {
            evenSum = evenSum + even;
        }

        for (int odd : oddList) {
            oddSum =oddSum + odd;
        }

        // Print results
        System.out.println("The Even list sum is : " + evenSum);
        System.out.println("The Odd list sum is : " + oddSum);
    }
}
