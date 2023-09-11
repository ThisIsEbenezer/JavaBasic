package com.basicjava;

//Write a Java program to check if a vowel is present in a string.

public class StringContainsVowels {
	
	public static void main(String[] args) {
		String input = "Input";
		System.out.println(checkBoolean(input));
		input = "TV";
		System.out.println(checkBoolean(input));
	}

	private static boolean checkBoolean(String input) {
		// TODO Auto-generated method stub
		boolean result = input.toLowerCase().matches(".*[aeiou].*");
		return result;
		
	}

}
