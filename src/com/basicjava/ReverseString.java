package com.basicjava;

import java.util.Scanner;

// How do you reverse a string in Java?
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String input= sc.nextLine(); 
		
		System.out.println(reverse(input));
		
		System.out.println(reverseStringBuilder(input));

	}

	private static String reverseStringBuilder(String input) {
		// TODO Auto-generated method stub
		StringBuilder reversed = new StringBuilder(input);
		
		return reversed.reverse().toString();
	}

	private static String reverse(String input) {
		// TODO Auto-generated method stub
				
		StringBuilder reversed = new StringBuilder();
		
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
		return reversed.toString();
	}

}
