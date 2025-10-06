package arraysProblem;

public class SortArrayAscending_4 {

	public static void main(String[] args) {

	
		int[] numbers = {100, 200, 50, 400, 10, 300};
		
		// Bubble Sort: Sorts an array in ascending order
		for (int i = 0; i < numbers.length - 1; i++) {
		    // Outer loop runs (n - 1) times, where n is the length of the array
		    // After each pass, the largest remaining unsorted element moves to its correct position at the end

		    for (int j = 0; j < numbers.length - 1 - i; j++) {
		        // Inner loop compares adjacent elements
		        // It runs fewer times with each outer loop pass (hence -i),
		        // because the largest elements are already "bubbled" to the end and sorted

		        if (numbers[j] > numbers[j + 1]) {
		            // If current element is greater than the next one, they are in the wrong order
		            // Swap them to move the larger element toward the end

		            int temp = numbers[j];               // Store current element in temp
		            numbers[j] = numbers[j + 1];         // Replace current with next
		            numbers[j + 1] = temp;               // Assign temp to next (swap complete)
		        }
		    }
		}

	      
	   
	      System.out.println("Sorted array in ascending order:");
	      for (int num : numbers) {
	         System.out.print(num + " ");
	      }
	
	      
	    //Brute force - Selection sort
	     

		/*
		 * for(int i = 0 ; i<numbers.length; i++) {
		 * 
		 * 	for(int j = i+1 ; j<numbers.length; j++) {
		 * 
		 *		 if(numbers[i]>numbers[j]) {
		 * 
		 * 			int temp = numbers[i]; 
		 * 			numbers[i] = numbers[j]; 
		 * 			numbers[j] = temp; 
		 * }
		 * 	 } 
		 *  	}
		 * 
		 * for(int number : numbers) { 
		 * 
		 * System.out.println(number);
		 * 
		 * }
		 */
	
	}

}
