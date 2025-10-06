package arraysProblem;

import java.util.HashSet;
import java.util.Set;

public class CommonElementin2Arrays_11 {
   public static void main(String[] args) {
      // Step 1: Define the first array with integer elements
      int[] array1 = {4, 3, 2, 1};

      // Step 2: Define the second array with integer elements
      int[] array2 = {8, 7, 6, 5, 4, 3, 1};

      // Step 3: Create a HashSet to store elements of array1 for fast lookup
      Set<Integer> set1 = new HashSet<>();
      for (int num : array1) {
         set1.add(num);  // Step 4: Add each element of array1 into set1
      }

      // Step 5: Create another HashSet to store common elements (avoids duplicates)
      Set<Integer> common = new HashSet<>();
      for (int num : array2) {
         // Step 6: Check if the current element of array2 exists in set1
         if (set1.contains(num)) {
            common.add(num);  // Step 7: If yes, add to the 'common' set
         }
      }

      // Step 8: Print the common elements found between array1 and array2
      System.out.println("Common elements: " + common);
   }
}


