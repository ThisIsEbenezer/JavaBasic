package com.basicjava.practice;

public class RotataionalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCD";
		String s2 = "CDAB";
		System.out.println(isRottational(s1,s2));
		
	}
	
	public static boolean isRottational(String s1,String s2) {		
		
		return (s1.length() == s2.length() && (s1+s1).indexOf(s2) != -1);
		
	}

}
