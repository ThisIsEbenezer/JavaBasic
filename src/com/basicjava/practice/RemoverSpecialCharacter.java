package com.basicjava.practice;

public class RemoverSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "CloudTech#!";
		int count =0;
		String removedString = "";
		
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;				
			} else {
				removedString = removedString + s.charAt(i);
			}
		}		
		if(count == 0) {
			System.out.println("No Sepcial Charater");
		}
		else {
			System.out.println("Sepcial Charater="+count);
		}
		
		System.out.println(removedString);

	}

}
 
