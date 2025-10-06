package javaStreams;

import java.util.Arrays;
import java.util.List;

public class Counting_Elements_4 {

	public static void main(String[] args) {
		
        List<String> names = Arrays.asList("John", "Mike", "Sara", "Jo");

        long count = names.stream().filter(name -> name.length() > 3).count();

        System.out.println("Count: " + count);
    }
	
}
