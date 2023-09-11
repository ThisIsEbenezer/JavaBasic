package com.basicjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write Java program that checks if two arrays contain the same elements.

public class ArraySameElements {
	public static void main(String[] args) {
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElements(a1, a2));
		System.out.println(sameElements(a1, a3));
		
	}

	private static boolean sameElements(Integer[] array1, Integer[] array2) {
		// TODO Auto-generated method stub
		Set<Integer> uniqueElements1 = new HashSet<>(Arrays.asList(array1));
		Set<Integer> uniqueElements2 = new HashSet<>(Arrays.asList(array2));
		
		if (uniqueElements1.size() != uniqueElements2.size()) {
			return false;
		}
		
		for (Integer obj : uniqueElements1) {
			System.out.println("Compare-"+obj+"-With-"+uniqueElements1);			
			if (!uniqueElements2.contains(obj)) {
				return false;
			}
		}
		
		return true;
	}

}
