package com.questions.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question {

	public static void main(String[] args) {
		String[] str = new String[] {"Apple","Banana","Carrot","Apple","Carrot","Carrot"};
		
		Arrays.stream(str)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x->x.getValue()%2 !=0)
				.forEach(System.out::println);
		
		String strg = "Hi Sanjay getup getup getup getup";
		
		String i =Arrays.stream(strg.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
									  .entrySet()
		                              .stream()
		                              .max(Map.Entry.comparingByValue(Comparator.naturalOrder()))
		                              .get()
		                              .getKey();
		                              
		System.out.println(i);
		
		Long j =Arrays.stream(strg.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
									  .values()
		                              .stream()
		                              .max(Comparator.naturalOrder())
		                              .get();
		System.out.println(j);
		                             
	}

}
