package com.basicjava;

//How do you check whether a string is a palindrome in Java?

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String input = "racecar";
		String input = "rar"; 
		
		 checkPalindromeSimple(input);
		 
		 System.out.println(isPalindrome(input));
	}

	private static void checkPalindromeSimple(String input) {
		// TODO Auto-generated method stub
		 String reversedInput = new StringBuilder(input).reverse().toString();		 
	     if (input.equals(reversedInput)) {
	          System.out.println(input + " is a palindrome.");
	      } else {
	          System.out.println(input + " is not a palindrome.");
	      }		 

	}
	
	private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }            
            left++;
            right--;
        }
        return true; // If all characters matched, it's a palindrome
    }

}
