package arraysProblem;

//Works only if the array contains consecutive numbers
public class MissingNumberInArray_10_A {
	
    public static void main(String[] args) {
        int[] numbers = {10, 11, 13, 14, 15, 16, 17};

        int actualSum = 0;
        
        for (int num : numbers) {
            actualSum =actualSum +  num;  // Sum of array elements
        }

        int expectedSum = 0;
        
        for (int i = 10; i <= 17; i++) {
            expectedSum = expectedSum + i;  // Sum of full range
        }

        int missing = expectedSum - actualSum;

        if (missing != 0) {
            System.out.println("The missing number is: " + missing);
        } else {
            System.out.println("There is no number missing");
        }
    }
}
