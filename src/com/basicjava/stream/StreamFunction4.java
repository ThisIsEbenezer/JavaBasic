package com.basicjava.stream;

import java.util.HashSet;
import java.util.Set;

//1) Sorted 
//2) anyMatch 
//3) allMatch 
//4) noneMatch 
//5) findAny 
//6) findFirst 
public class StreamFunction4 {
	public static void main(String[] args) {
		Set<String> fruties = new HashSet<>();
		fruties.add("One mango");
		fruties.add("One apple");
		fruties.add("Two apple");
		fruties.add("More  grapes");
		fruties.add("Two guavas");
		
		boolean anyMatch = fruties.stream().anyMatch( value-> {
			return value.toUpperCase().startsWith("ONE");
		});
		System.out.println(anyMatch);
		
		boolean allMatch = fruties.stream().allMatch( value-> {
			return value.toUpperCase().startsWith("ONE");
		});
		System.out.println(allMatch);
		
		boolean noneMatch = fruties.stream().noneMatch( value-> {
			return value.toUpperCase().startsWith("THREE");
		});
		System.out.println(noneMatch);
	}

}
