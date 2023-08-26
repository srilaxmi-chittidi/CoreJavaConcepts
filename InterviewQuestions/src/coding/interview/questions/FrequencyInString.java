package coding.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String str = scan.nextLine();
		scan.close();
		checkFrequency(str);
	}
	
	public static void checkFrequency(String str) {
		Map<Character, Integer> strMap = new HashMap<>();
		char charArray[] = str.toCharArray();
		for(char c:charArray) {
			if(Character.isLetter(c)) {
				if(strMap.containsKey(c)) {
					strMap.put(c, strMap.get(c)+1);
				}else {
					strMap.put(c, 1);
				}	
			}
		}
		strMap.entrySet().forEach(
				e->{
					System.out.println(e.getKey()+" "+e.getValue());
				}
		);
	}

}
