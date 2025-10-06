package arraysProblem;

import java.util.HashSet;
import java.util.Set;

public class HowToFindDuplicateElementsInArray_6 {
   public static void main(String[] args) {
	   
      String progLanguage [] = {"java", "python", "ruby", "J", "python", "ruby", "abhishek", "rony", "ruby"};
      
   // Step 2: Create a HashSet to store unique elements seen so far
      Set<String> seen = new HashSet<String>();
      
   // Step 3: Create another HashSet to store duplicate elements
  	Set<String> duplicates = new HashSet<String>();
  	
  	
  	for(int i = 0; i<progLanguage.length; i++) {
  		
  		// Step 5: Try to add the current string to 'seen'
        // If add() returns false, the string already exists, so it's a duplicate
  		// you're already adding unique elements to seen using this line:
  		
  		if(!seen.add(progLanguage[i])) {
  			duplicates.add(progLanguage[i]);
  		}
  		
  	}
  	
  	System.out.println("The duplicate elements are " + duplicates );
  	
  	System.out.println(seen);

   }
}

/*
 * int numbers[] = {1,2,3,4,2,3,4};
 * 
 * 
 * Set<Integer> seen = new HashSet<Integer>();
 * 
 * Set<Integer> duplicates = new HashSet<Integer>();
 * 
 * for(int i = 0; i<numbers.length; i++) 
 * 
 * { 
 * if(seen.contains(numbers[i])) {
 * 
 * 		duplicates.add(numbers[i]); }
 * 
 * 
 * else { 
 * 
 * seen.add(numbers[i]);
 * 
 * 
 * } }
 * 
 * 
 * 
 * if(duplicates.isEmpty()) { 
 * System.out.println("All Unique elements"); } 
 * 
 * else
 * { 
 * System.out.println("The duplicate elements are " + duplicates); }
 */