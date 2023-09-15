package com.basicjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Samuel","Sam","Ebenezer","Benisha","Beni");
		
		List<String> longNames = new ArrayList<>();
		
		//longNames = names.stream().filter( str -> str.length() > 6 && str.length() <8).collect(Collectors.toList());
		//System.out.println(longNames);
		
		names.stream().filter( str -> str.length() > 6 && str.length() <8).forEach(System.out::println);
	}

}
