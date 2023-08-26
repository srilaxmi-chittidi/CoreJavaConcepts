package com.java8.funtionalInterface;

public class MyFunctionalInterface {
	
	int s=9;

	MyFI mf = () -> System.out.println("This is functional interface");
	
	mf.myMethod();
} 	

@FunctionalInterface
interface MyFI {
	void myMethod();
}

/**
 * Consumer  = 
 * Predicate =
 * Supplier  = 
 * Function  =  
 * 
 */
*/