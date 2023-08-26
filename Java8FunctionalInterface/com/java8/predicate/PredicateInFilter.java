package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateInFilter {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
	//	List<Integer> collect = list.stream().filter(x -> x>5).toList();
		List<Integer> collect = list.stream().filter(x -> x>5).collect(Collectors.toList());

		System.out.println(collect);
	}

}
