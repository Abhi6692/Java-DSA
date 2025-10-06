package javaStreams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Max_Min_8 {

	
	    public static void main(String[] args) {
	    	
	        List<Integer> numbers = Arrays.asList(1,2,3,4);
	        
	        //max() and min() return an Optional to prevent NullPointerException
	        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo); 
	        // Equivalent to max((a, b) -> a.compareTo(b))

	        //To handle an empty list explicitly
	        if (maxNumber.isPresent()) {
	            System.out.println("Max Number: " + maxNumber.get());
	        } else {
	            System.out.println("List is empty, no max value available.");
	        }

	        
	        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo); 
	        // Equivalent to min((a, b) -> a.compareTo(b))
	        
	        //To handle an empty list explicitly
	        if (maxNumber.isPresent()) {
	            System.out.println("Min Number: " + minNumber.get());
	        } else {
	            System.out.println("List is empty, no min value available.");
	        }
	        
	        
	    }
	}

