package demo;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuyStockSellTime {

	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,9,6,4};
		//maxProfit(prices);
		//reverseString("Hi Hello How are you?");
		//countChars("Hi Hello How are you?");
		//System.out.println(isAnagram("Listen", "Sliet"));
		//System.out.println(isPalindrome("malaylam"));
		//System.out.println(uniqueCharsInStr("Java"));
		//System.out.println(isRotateStr("RAMA","AMAR"));
		
		System.out.println(maxProfit(prices));
	}
//	public static int maxProfit(int[] prices) {
//        int minVal = Arrays.stream(prices).sorted().findFirst().get();
//        int index = prices[minVal];
//        return -1;
//        
//    }
	public static void reverseString(String str){ 
			String st = Arrays.stream(str.split(" "))
					.map(val->new StringBuilder(val).reverse())
					.collect(Collectors.joining(" "));
			
			System.out.println(st);
			
	}
	
	public static void countChars(String str){ 
		Arrays.stream(str.split(""))
		  		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		  		.forEach((k,v) ->  System.out.println(k+" "+v));
	} 
	
	public static boolean isAnagram(String first, String second){ 
       boolean isAnagram =  Stream.of(first.toLowerCase().split("")) 
					.sorted() 
					.collect(Collectors.joining()) 
					.equals( Stream.of(second.toLowerCase().split("")) 
					                            .sorted() 
					                            .collect(Collectors.joining())); 
       return isAnagram;
	} 
	
	public static boolean isPalindrome(String str){ 
		int bp = str.length()-1; 
		return IntStream
				.range(0, str.length())
				.allMatch(position->str.charAt(position) == str.charAt(bp-position)); 
	} 
	/*
	 * Unique Characters: Write a Java 8 program to determine if a string has all unique characters. 
	*/ 
	public static boolean uniqueCharsInStr(String str){ 
        return Arrays.stream(str.split(""))
        	  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        	  .entrySet()
        	  .stream()
        	  .filter(v->v.getValue()>1)
        	  .findAny()
        	  .isEmpty();
	} 
	
	public static boolean isRotateStr(String orgStr, String target){ 
		String concatString  = orgStr+orgStr; 
		return concatString.contains(target) ? true : false; 
	} 
	
//	public static void maxProfit1(int[] prices) {
//	   int min = Arrays.stream(prices)
//	   			.boxed()
//	   			.sorted()
//	   			.min(Comparator.naturalOrder())
//	   			.get();
//	  System.out.println("Min "+min+" "+Arrays.binarySearch(prices, min));
//     //  return profit;
//	}
	public static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int profit;
		int i =0;
		int minIndex =0,maxIndex =prices.length;
       for(;i<prices.length;i++) {
    	  if( min > prices[i]){
    		  min = prices[i];
    		  minIndex=i;
    	  }
       }
       int j=minIndex;
       for(;j<prices.length;j++) {
    	   if(max<prices[j]) {
    		   max= prices[j];
    		   maxIndex=j;
    	   }
       }
       System.out.println(minIndex+" "+maxIndex);

       System.out.println(min+" "+max);
       profit = max-min;
       return profit;
	}
}