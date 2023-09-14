package com.basicjava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLetterCount {
	
	public static void main(String[] args) {
		List<String> groupWords = Arrays.asList("apple","banana","pear","grape");
		
		Map<Integer,List<String>> map = groupWords.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(map);
	}

}
