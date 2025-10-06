package stringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*	Input: geeksforgeeks
	Output: e
	Explanation: 'e' occurs 4 times in the string
	*/

public class GetMaxOccurringChar_14 {

	
	public static void getmaxOccurChar(String str) { 
		
		
		char ch [] = str.toCharArray();
		
		Map<Character,Integer> freqMap = new HashMap<Character, Integer>();
		
		for(char c : ch) {
			
			if(!freqMap.containsKey(c)) {
				freqMap.put(c, 1);
			}
			
			else {
				
				freqMap.put(c, freqMap.get(c)+1);
			}
		}
		
		
		char maxChar = '\0' ;
		
		int maxOccurnace = 0;
		
		
		for(Entry<Character, Integer> E :freqMap.entrySet() ) {
			
			if(E.getValue() > maxOccurnace) {
				
				maxOccurnace = E.getValue();
				maxChar = E.getKey();
			}
		}
		
		System.out.println("The maximum occuring character is -  " + maxChar + " Repeated " + maxOccurnace + " times");
		
	}
	
	public static void getSecondmaxOcurChar(String str) {
	    Map<Character, Integer> freqMap = new HashMap<>();

	    for (char ch : str.toCharArray()) {
	        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	    }

	    int maxValue = 0;
	    int secondMaxValue = 0;
	    char maxChar = '\0';
	    char secondMaxChar = '\0';

	    for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
	        if (entry.getValue() > maxValue) {
	            secondMaxValue = maxValue;
	            secondMaxChar = maxChar;

	            maxValue = entry.getValue();
	            maxChar = entry.getKey();
	        } else if (entry.getValue() > secondMaxValue && entry.getValue() != maxValue) {
	            secondMaxValue = entry.getValue();
	            secondMaxChar = entry.getKey();
	        }
	    }

	    System.out.println("Second most frequent character: " + secondMaxChar +
	            " (count: " + secondMaxValue + ")");
	}

	
	
	
	public static void main(String[] args) {
		getmaxOccurChar("geeksforgeeks");
		getSecondmaxOcurChar("geeksforgeeks");
	}
	
}
