package stringProblem;
import java.util.Arrays;

/*Key Rules:
Same characters (including their frequency)

Same length

Case is usually ignored (unless stated otherwise)

Often, spaces and punctuation are ignored in phrases
*/


public class AnagramString_2 {
   public static void main(String[] args) {
	   
      String str1 = "army";
      String str2 = "mary";
      
      char[] arr1 = str1.toLowerCase().toCharArray();
      char[] arr2 = str2.toLowerCase().toCharArray();
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      
      if (Arrays.equals(arr1, arr2)) {
    	  
         System.out.println("Given Strings are ANAGRAM");
      } else {
         System.out.println("Given Strings are NOT ANAGRAM");
      }

   }
}
