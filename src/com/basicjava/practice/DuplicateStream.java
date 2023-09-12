package com.basicjava.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateStream {
	
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list,1,2,3,4,5,2,4);
		//list.forEach(System.out::println);
		
		Set<Integer> set = new HashSet<>();
		//Remove DUplicate
		//list.stream().filter(x -> set.add(x)).forEach(System.out::println);
		
		//List of Removed Duplicate
		//list.stream().filter(x -> !set.add(x)).forEach(System.out::println);
		
		List<Integer> duplicateValue = list.stream().filter(x -> !set.add(x)).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(duplicateValue);
	}

}
