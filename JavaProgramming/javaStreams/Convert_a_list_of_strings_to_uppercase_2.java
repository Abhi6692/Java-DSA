package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Mapping and Transforming Data

public class Convert_a_list_of_strings_to_uppercase_2 {
	
	public static void main(String[] args) {
		
        List<String> names = Arrays.asList("john", "mike", "sara");

        List<String> upperCaseNames = names.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
