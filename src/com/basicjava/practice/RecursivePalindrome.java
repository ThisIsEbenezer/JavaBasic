package com.basicjava.practice;

public class RecursivePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "rar"; 
		
		System.out.println(isPalindrome(input));
		 

	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		if(str.length() == 0 || str.length() ==1) {
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1,str.length()-1));
		}
		
		return false;
	}

}
