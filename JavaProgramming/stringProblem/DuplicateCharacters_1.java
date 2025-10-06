package stringProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateCharacters_1 {
  
   public static void duplicateCharsusing_Map(String string) {
    
      if (string == null) {
         System.out.println("NULL String");
      }

      if (string.isEmpty()) {
         System.out.println("EMPTY String");
      }

      if (string.length() == 1) {
         System.out.println("Single Character String");
      }

      char arr[] = string.toLowerCase().toCharArray();
      
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      

      for(int i = 0; i < arr.length; ++i) {
    	  
    	  if (arr[i] == ' ') {
    	        continue; // Ignore spaces
    	    }
    	    
         if (!map.containsKey(arr[i])) {
            map.put(arr[i], 1);
         } else {
            map.put(arr[i], (Integer)map.get(arr[i]) + 1);
         }
      }

      for(Entry<Character, Integer> e : map.entrySet()){
  		
  		if(e.getValue()>1) {
  			System.out.println("The repeated character is  -- " + e.getKey() + "  " + "The Count is--> " + e.getValue());
  		}
  	}

   }

   
   
   public static void duplicateCharsusing_Set(String str) {
		
		Set<Character> seen = new HashSet<Character>();
		Set<Character> duplicates = new HashSet<Character>();
		
		for(char ch : str.toLowerCase().toCharArray()) {
			
			if(seen.contains(ch)) {
				duplicates.add(ch);
			}
			
			else {
				seen.add(ch);
			}
			
			}
		
		System.out.println(duplicates);
		//System.out.println(seen);
		
	}
	
   public static void revSentence(String str) {
	   
	   String words[] = str.split(" ");
	   
	   String Finalrev = "";
	   
	   for(int i = words.length-1 ; i>=0 ; i--) {
		  
		   String rev = "";
		   
		   String word = words[i];
		   
		   for(int j =word.length()-1 ; j>=0 ;j -- ) {
			   
			   rev = rev + word.charAt(j);
		   }
		   
		   Finalrev = Finalrev + rev + " ";
		   
	   }
	   System.out.println(Finalrev);
	   
   }
   
   
   public static void main(String[] args) {
      
	  // duplicateCharsusing_Map("India Abbhii");
	  // duplicateCharsusing_Set("India Abbhii");
	  // revSentence("I am Happy hehe");
	   revSentence("I am Abhishek");
   }
}




