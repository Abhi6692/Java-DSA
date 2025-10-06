package stringProblem;

public class VowelConsonantCount_12{
    
	
	public static void countVowelsAndConsonants(String str) {
	    int vowelCount = 0;
	    int consonantCount = 0;

	    char[] charArray = str.toLowerCase().toCharArray();

	    for (char ch : charArray) {
	        if (Character.isLetter(ch)) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            } else {
	                consonantCount++;
	            }
	        }
	    }

	    System.out.println("Vowels: " + vowelCount);
	    System.out.println("Consonants: " + consonantCount);
	}

	
	
	
	public static void main(String[] args) {
		countVowelsAndConsonants("Abcd");
	}
}


