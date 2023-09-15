package com.basicjava.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodDemo3 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,1,3,6,5,9);
		
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list1);
		
		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(list3);
		
		
		List<String> stringList = Arrays.asList("John","Mary","Kim","David","Smith");
		System.out.println(stringList);
		List<String> stringList1 =	stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(stringList1);
		
		
		
		
		
	}

}
