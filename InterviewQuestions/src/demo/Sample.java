package demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Demo Class");
		String str = "Java";
		char[] charStr = str.toCharArray();
		Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));
				
	}

}
