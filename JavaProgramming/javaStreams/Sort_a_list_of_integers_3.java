package javaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_a_list_of_integers_3 {

	public static void main(String[] args) {
		
		
		List<Integer> intList = Arrays.asList(3,4,5,8,2);
		
		//This just prints each element in default sorted order 
		intList.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.println("=================================================");
		
		//Sorted in ascending order and stored in another list
		List<Integer> AscendingSortedList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Int list in ascending order is --- "  + AscendingSortedList );
		
		System.out.println("=================================================");
		
		//Sorted in descending order and stored in another list
		List<Integer> DescendingSortedList = intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted Int list in ascending order is --- "  + DescendingSortedList );
		
		
	}
}
