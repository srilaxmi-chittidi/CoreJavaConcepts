package coding.interview.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDupsInArray {

	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,4,3,5,6,5,8};

		//FindDupsBySets(input);
		//FindDupsByMaps(input);
		findDupsByArrays(input);
	}
	
	public static void FindDupsBySets(int[] setArray) {
		Set<Integer> set = new HashSet<>();
		for(int num :setArray) {
			if(set.add(num) == false) {
				System.out.println(num);
			}
		}
	}
	public static void FindDupsByMaps(int[] mapArray) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int num :mapArray) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void findDupsByArrays(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1 ;j<array.length;j++) {
				if(array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}
