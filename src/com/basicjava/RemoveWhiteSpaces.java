package com.basicjava;

//How do you remove spaces from a string in Java?

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String input = "This is a sample string with spaces.";
	        // Remove spaces using the replace() method
	        String stringWithoutSpaces = input.replace(" ", "");
	        System.out.println("Original String: " + input);
	        System.out.println("String without Spaces: " + stringWithoutSpaces);
	        
	        System.out.println(removeWhiteSpaces(input));
	}

	private static String removeWhiteSpaces(String input) {
		// TODO Auto-generated method stub
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		System.out.println(charArray);
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				System.out.println(c);
				output.append(c);
			}
		}
		
		return output.toString();
		
	}

}
