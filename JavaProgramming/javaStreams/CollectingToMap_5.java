package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectingToMap_5{


	
public static void main(String[] args) {
	
List<String> names = Arrays.asList("John", "Mike", "Sara");

Map<String, Integer> nameLengthMap = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));

	        System.out.println("Name Length Map: " + nameLengthMap);
	    }
	}


