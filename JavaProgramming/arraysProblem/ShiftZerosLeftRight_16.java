package arraysProblem;

public class ShiftZerosLeftRight_16 {


	public static void shiftZerosRight(int[] arr) {

		int lastNonZeroIndex = 0;  // This will track where the next non-zero element should be placed

		// Traverse through the entire array
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != 0) {  // Check if the current element is non-zero
				// Swap the current non-zero element with the element at lastNonZeroIndex
				int temp = arr[i];
				arr[i] = arr[lastNonZeroIndex];
				arr[lastNonZeroIndex] = temp;

				// Increment lastNonZeroIndex, to place the next non-zero element at the next position
				lastNonZeroIndex++;
			}
		}
		// Print the updated array
		System.out.println("Array after shifting zeros to Right:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void shiftZerosLeft(int[] arr) {
	    int lastNonZeroIndex = arr.length - 1;  // Start from the last index of the array

	    // Traverse through the entire array from the right to the left
	    for (int i = arr.length - 1; i >= 0; i--) {
	        if (arr[i] != 0) {  // Check if the current element is non-zero
	            // Swap the current non-zero element with the element at lastNonZeroIndex
	            int temp = arr[i];
	            arr[i] = arr[lastNonZeroIndex];
	            arr[lastNonZeroIndex] = temp;

	            // Decrement lastNonZeroIndex, to place the next non-zero element at the next position
	            lastNonZeroIndex--;
	        }
	    }
	    
	    System.out.println("Array after shifting zeros to Left:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	    
	    
	}


	public static void main(String[] args) {
		
		//shiftZerosRight(new int [] {1,2,0, 9, 0, 8, 5} );
		//shiftZerosLeft(new int [] {1,2,0, 9, 0, 8, 5});
		

	}
}
