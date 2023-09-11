package com.basicjava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();

		scores.put("Stud1", 95);
		scores.put("Stud2", 80);
		scores.put("Stud3", 97);
		scores.put("Stud4", 78);
		scores.put("Stud5", 65);

		System.out.println(scores);
		
		scores = sortHashMapByValue(scores);

		System.out.println(scores);
	}
	
	public static Map<String, Integer> sortHashMapByValue(Map<String, Integer> hashMap) {
		
			List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
			//System.out.println(entryList);
			
			Collections.sort(entryList, (x,y) -> x.getValue().compareTo(y.getValue()));
			
			LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
			
	        for (Map.Entry<String, Integer> entry : entryList) {
	        	sortedHashMap.put(entry.getKey(), entry.getValue());
	        }

			
        return sortedHashMap;
    }



}
