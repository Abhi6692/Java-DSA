package arraysProblem;



	public class AdjacentDifferenceArray_14 {
	    public static void main(String[] args) {
	        // Step 1: Input array
	        int[] input = {10, 7, 5, 12};

	        // Step 2: Create a new array to store differences (length - 1)
	        int[] differences = new int[input.length - 1];

	        // Step 3: Loop through and compute differences between adjacent elements
	        for (int i = 0; i < input.length - 1; i++) {
	            differences[i] = input[i] - input[i + 1];
	        }

	       for(int arr :differences ) {
	    	   System.out.println(arr);
	       }
	    }
	}



