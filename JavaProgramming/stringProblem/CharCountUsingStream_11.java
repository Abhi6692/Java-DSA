package stringProblem;

//Count the number of occurrences of a [given character] without using any loop by using Streams

public class CharCountUsingStream_11 {
	
    public static void main(String[] args) {
        
    	String str = "hello world";
        

  
        //str.chars() returns a java.util.stream.IntStream
        
		/*
		 * Each element in the stream is an int representing a UTF-16 code unit (i.e.,
		 * the numeric value of each character in the string).
		 */
        long count = str.chars().filter(ch -> ch == 'd').count();

        System.out.println("Occurrences of d is "  + count);
    }
}

