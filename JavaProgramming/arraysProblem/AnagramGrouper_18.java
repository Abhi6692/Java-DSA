package arraysProblem;

import java.util.*;
import java.util.Map.Entry;


/*
Given an array of strings, group the anagrams together.

Input: str = ["eat", "tea", "tan", "ate", "nat", "bat"]

Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
 */

/*To group anagrams from an array of strings, you can use a Map where the 
 * key is a sorted version of each word (because anagrams share the same letters when sorted), and 
 * the value is a list of words that match that sorted key.*/

public class AnagramGrouper_18 {

    public static List<List<String>> groupAnagrams(String[] words) {
        
        // Step 1: Handle edge case - if input is null or empty, return an empty list
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        // Step 2: Create a HashMap to group words by their "sorted character form"
        // Key: sorted string (e.g., "aet")
        // Value: list of words that share that sorted string (e.g., ["eat", "tea", "ate"])
        Map<String, List<String>> map = new HashMap<>();

        // Step 3: Process each word in the input array
        for (String word : words) {

            // Convert the word to a char array to sort its letters
            char[] chars = word.toCharArray();

            // Sort the characters alphabetically
            Arrays.sort(chars);

            // Convert sorted characters back to a string (this becomes the "key")
            String key = new String(chars);

            /*
             Example:
             word = "eat" → chars = ['e','a','t'] → after sort = ['a','e','t'] → key = "aet"
             word = "tea" → key = "aet"
             word = "tan" → key = "ant"
             */

            // If this sorted key doesn't exist in the map, create a new list for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word (not sorted!) to the corresponding list
            map.get(key).add(word);
        }

        // Step 4: Collect all grouped anagrams from the map into a result list
        List<List<String>> result = new ArrayList<>();

        // Loop through each map entry (key → list of anagrams)
        for (Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue()); // add the list of anagrams to the result
        }

        // Step 5: Return the grouped anagrams
        return result;
    }

    public static void main(String[] args) {
        // Input array of words
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the method to group anagrams
        List<List<String>> grouped = groupAnagrams(input);

        // Print the result
        System.out.println(grouped); 
        // Example Output: [[eat, tea, ate], [tan, nat], [bat]]
    }
}