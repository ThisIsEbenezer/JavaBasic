package com.basicjava.practice;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x*x).sum();
		System.out.println("Sum is "+ sum);
		
		

	}

}
