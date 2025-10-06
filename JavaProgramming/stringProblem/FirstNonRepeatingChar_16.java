package stringProblem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar_16 {
	
    public static void main(String[] args) {
        
    	String str = "RonyRo";

        char chrary [] = str.toCharArray();
        
    	// LinkedHashMap maintains insertion order
        //I was using hashmap before , and any random non repeating character was coming.
   	 Map<Character, Integer> freqMap = new LinkedHashMap<Character, Integer>();
   	 
   	 for(int i = 0; i<chrary.length; i++) {
   		 
   		 if(!freqMap.containsKey(chrary[i])){
   			 
   			 freqMap.put(chrary[i], 1);
   		 }
   		 else {
   			 freqMap.put(chrary[i], freqMap.get(chrary[i])+1);
   		 }
   	 }
   	 
   	 for(Entry<Character, Integer> entry : freqMap.entrySet()) {
   		 if(entry.getValue()==1) {
   			 System.out.println(entry.getKey());
   			 break;
   		 }
   	 }
   	 
   	}
}
