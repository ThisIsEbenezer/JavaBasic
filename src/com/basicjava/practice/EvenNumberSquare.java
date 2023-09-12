package com.basicjava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberSquare {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		List<Integer> SQnumbers = numbers.stream().filter(x -> x%2 == 0).map(x -> x*x).collect(Collectors.toList());
		
		System.out.println(SQnumbers);
	}

}
