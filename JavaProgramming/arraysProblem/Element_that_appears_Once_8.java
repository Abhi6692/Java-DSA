package arraysProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Element_that_appears_Once_8 {
	
   public static void main(String[] args) {
	   
      int a []  = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 1};
      
      HashMap<Integer, Integer> frequencymap = new HashMap<Integer, Integer>();

      for(int i = 0; i < a.length; ++i) {
         if (!frequencymap.containsKey(a[i])) {
        	 frequencymap.put(a[i], 1);
         } else {
        	 frequencymap.put(a[i], frequencymap.get(a[i]) + 1);
         }
      }

    
      
      
     

     for(Entry<Integer, Integer> E :  frequencymap.entrySet()) {
    	 
    	 //System.out.println("Key is =" + E.getKey() + " " + "The Value is =" + E.getValue());
    	 
    	 if(E.getValue()==1) {
    		// System.out.print("The Element that appears only once is ");
    		 System.out.print(E.getKey()+ ",");
    	 }
     }

   }
}
