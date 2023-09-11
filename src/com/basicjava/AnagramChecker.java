package com.basicjava;

import java.util.Arrays;

public class AnagramChecker {
	public static void main(String[] args) {
			String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	}

	private static boolean areAnagrams(String str1, String str2) {
		// TODO Auto-generated method stub

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        System.out.println(charArray1);
        System.out.println(charArray2);

        return Arrays.equals(charArray1, charArray2);
	}

}
