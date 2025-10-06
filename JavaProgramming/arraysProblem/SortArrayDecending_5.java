package arraysProblem;

public class SortArrayDecending_5 {
	
	
		   public static void main(String[] args) {
			   
		      int[] a = {100, 200, 50, 400, 10, 300};
		      
		      // Sorting array in descending order using Bubble Sort
		      for (int i = 0; i < a.length - 1; i++) {
		    	  
		         for (int j = 0; j < a.length - 1 - i; j++) {
		        	 
		            if (a[j] < a[j + 1]) { // Compare for descending order
		            	
		               // Swap a[j] and a[j + 1]
		               int temp = a[j];
		               a[j] = a[j + 1];
		               a[j + 1] = temp;
		            }
		         }
		      }
		      
		      // Printing the sorted array
		      System.out.println("Sorted array in descending order:");
		      for (int num : a) {
		         System.out.print(num + " ");
		      }
		   }
		}


