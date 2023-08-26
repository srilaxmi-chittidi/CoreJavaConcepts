package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		
		
	}

}

class StringProcessor{
	static List<String> testFilter(List<String> list, Predicate<String> predicate) {
		return list.stream().filter(predicate::test).collect(Collectors.toList());		
	}
}