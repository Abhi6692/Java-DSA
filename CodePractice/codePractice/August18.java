package codePractice;

import java.lang.reflect.Array;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class August18 {
	

	public static void revArray(int [] numbers , int start, int end) {
		
		while(start<end) {
			int temp = numbers[start];
			numbers[start]= numbers[end];
			numbers[end] = temp;
			start++;
			end--;
			
			
		}
	}
		public static void rotateArray(int [] num, int d) {
		
			d= d%num.length;
			
			
			
			revArray(num,0,d-1 );
			revArray(num,d,num.length-1);
			revArray(num,0,num.length-1 );
			
		
		}
	
	
	
	
	
	public static void main(String[] args) {

		
}}