package stringProblem;


   	
	public class StringSwapper_5 {

	    public static void swapStrings(String str1, String str2) {
	    	
	        System.out.println("Before swap:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);

	        // Swapping without using a third variable
	        str1 = str1 + str2;
	        
	        str2 = str1.substring(0, str1.length() - str2.length());
	        str1 = str1.substring(str2.length());

	        System.out.println("\nAfter swap:");
	        System.out.println("str1 = " + str1);
	        System.out.println("str2 = " + str2);
	    }

	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "World";

	        swapStrings(str1, str2);
	    }
	}

	
	
