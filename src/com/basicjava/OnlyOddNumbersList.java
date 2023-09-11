package com.basicjava;

import java.util.ArrayList;
import java.util.List;

public class OnlyOddNumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		//list.add(6);
		System.out.println(onlyOddNumbers(list));
		
		//Alternative
		System.out.println(onlyOddNumbersCheck(list));
		
	}

	private static boolean onlyOddNumbers(List<Integer> list) {
		// TODO Auto-generated method stub
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}		
		return true;
	}
	
	private static boolean onlyOddNumbersCheck(List<Integer> list) {
		// TODO Auto-generated method stub
		if(list.parallelStream().anyMatch(x -> x % 2 ==0 )) {
			return false;
		}
		
		return true;
	}

}
