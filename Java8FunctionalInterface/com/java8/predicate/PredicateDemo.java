package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// Creating Predicate 
		Predicate<Integer> greaterThanTen = (i) -> i>10;
		
		System.out.println(greaterThanTen.test(12));
		
		//Creating Predicate
		Predicate<Integer> lessThanTwenty = (j) -> j<20;
		
		System.out.println(lessThanTwenty.test(34));
		
		
	}

}

