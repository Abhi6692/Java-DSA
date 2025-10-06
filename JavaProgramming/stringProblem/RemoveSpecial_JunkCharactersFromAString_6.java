package stringProblem;

public class RemoveSpecial_JunkCharactersFromAString_6 {
   
	
	public static void main(String[] args) {
		
		
	  //Remove Junk Characters
      String S = "@^#aBhishek123^&%$&22";
      S = S.replaceAll("[^a-zA-Z0-9 ]", ""); //Match anything except letters, digits, and spaces
      System.out.println(S);
      
      //Remove Only Digits
      String input = "abc123def456";
      String result = input.replaceAll("[0-9]", ""); //\\d matches any digit (0–9)
      System.out.println(result); // Output: abcdef
      
      

   }
}
