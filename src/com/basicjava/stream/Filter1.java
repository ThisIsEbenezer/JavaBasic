package com.basicjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  numList = new ArrayList<>();
		numList.add(10);
		numList.add(15);
		numList.add(20);
		numList.add(25);
		numList.add(30);
		
		List<Integer>  numsList = Arrays.asList(10,15,20,25,30);
		List<Integer>  evenNumList = new ArrayList<>();
		
		//evenNumList = numsList.stream().filter(x -> x%2 ==0).collect(Collectors.toList());
		//System.out.println(evenNumList);
		
		numsList.stream().filter(x -> x%2 ==0).forEach(n->System.out.println(n));
		
		numsList.stream().filter(x -> x%2 ==0).forEach(System.out::println);
		
		//System.out.println(numsList);
		
		
	}

}
