package com.basicjava.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,1,3,4,5,6);		
		List<Integer> list2 = list1.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(list2); //[11, 12, 13, 14, 15, 16]
		
		
		List<Integer> l1 = Arrays.asList(1,2,1);
		List<Integer> l2 = Arrays.asList(3,6,4);
		List<Integer> l3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalList = Arrays.asList(l1,l2,l3);
		//System.out.println(finalList);
		
		List<Integer> result1 = finalList.stream().flatMap(x ->x.stream()).distinct().collect(Collectors.toList());
		
		System.out.println(result1);
		
		List<Integer> result2 = finalList.stream().flatMap(x ->x.stream().map(n->n+10)).distinct().sorted().collect(Collectors.toList());
		
		System.out.println(result2);
		
		
		long result3 = finalList.stream().flatMap(x ->x.stream().map(n->n+10)).distinct().sorted().count();
		System.out.println(result3);
		
	}

}
