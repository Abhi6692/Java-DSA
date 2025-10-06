package arraysProblem;

//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
/*	Parameter		Description
	src				The source array (the array to copy from)
	srcPos			Starting position in the source array
	dest			The destination array (the array to copy to)
	destPos			Starting position in the destination array
	length			Number of elements to copy*/

public class Merge2Arrays_12 {
	
	   public static void main(String[] args) {
	      // Step 1: Define the first and second arrays
	      int[] a = {1, 2, 3, 4};
	      int[] b = {5, 6, 7, 8, 9, 0, 13, 11, 12};

	      // Step 2: Create a new array 'c' to hold all elements from 'a' and 'b'
	      int[] c = new int[a.length + b.length];

	      // Step 3: Copy elements from array 'a' into 'c' starting at index 0
	      System.arraycopy(a, 0, c, 0, a.length);

	      // Step 4: Copy elements from array 'b' into 'c' starting at index a.length
	      System.arraycopy(b, 0, c, a.length, b.length);

	      // Step 5: Display merged array
	      System.out.println("The merged array elements are:");
	      for (int value : c) {
	         System.out.print(value + "|");
	      }
	   }
	}


	/*
	 * public static void main(String[] args) { int[] a = {1, 2, 3}; int[] b = {4,
	 * 5, 6};
	 * 
	 * // Create a new array large enough to hold both a and b 
	 * int merged [] = new int[a.length + b.length];
	 * 
	 * 
	 * // Copy elements from first array 
	 * 
	 * for (int i = 0; i < a.length; i++) {
	 * merged[i] = a[i]; }
	 * 
	 * // Copy elements from second array 
	 * 
	 * for (int i = 0; i < b.length; i++) {
	 * merged[a.length + i] = b[i]; }
	 * 
	 * // Print the merged array for (int num : merged) { System.out.print(num +
	 * " "); } }
	 */