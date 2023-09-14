package com.basicjava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllWordsToSingleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> groupWords = Arrays.asList("Hello"," ","World","!");
		
		String result = groupWords.stream().collect(Collectors.joining());

		System.out.println(result);
	}

}
