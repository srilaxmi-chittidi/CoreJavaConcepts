package com.questions.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Questions {

	public static void main(String[] args) {
	//	System.out.println("Is 15 FizzBuzz ? "+fizzBuzz(15));
	//	findCountOfChars("Rama Sita");
	//	findMaxEle(new int[] {12,19,20,88,00,9});
		int[] arr = new int[] {3,7,1,2,8,4,5};
		int[] result = first3IntSum(arr);
	//	Arrays.stream(result).forEach(System.out::println);
		syncDemo();
	}
	
	private static void findMaxEle(int[] input) {
		System.out.println("Max element in given array "+ Arrays.stream(input).max().getAsInt());
	}

	public static int[] first3IntSum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int r = 10-arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int s = r-arr[j];
				for(int k =j+1; k<arr.length;k++) {
					if(s==arr[k])
						return new int[] {arr[i],arr[j],arr[k]};
				}
			}
		}
		return new int[0];
	}
	public static String fizzBuzz(int input) {
		
		String output = Optional.of(input)
				.map(i->(i%3==0 ? "Fizz":"")+ (i%5==0 ? "Buzz":""))
				.get();
		return output.isEmpty() ? Integer.toString(input) : output;
	}
	
	public static void findCountOfChars(String str) {
		
		Map<String,Long> map = Arrays.stream(str.split(""))
		      .map(String::toLowerCase)
		      .collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
		
		map.forEach((k,v)->System.out.println(k+" "+v));
	}
	
	public static void syncDemo() {
		 Map<Integer, String> map = new HashMap<>();
		    map.put(1, "baeldung");
		    map.put(2, "HashMap");
		    Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
		    Iterator<Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();
		    while (iterator.hasNext()) {
		        synchronizedMap.put(3, "Modification");
		        iterator.next();
		    }
	}

}
