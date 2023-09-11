package com.basicjava.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondHigest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = new ArrayList<>();
		number.add(5);
		number.add(10);
		number.add(2);
		number.add(19);
		number.add(2);
		number.add(20);
		
		Integer secondHighest = findSecondHighest(number);
		
		if(secondHighest != null) {
			System.out.println(secondHighest);			
		} else {
			System.out.println("Invalid INput");
		}
		
	}

	private static Integer findSecondHighest(List<Integer> number) {
		// TODO Auto-generated method stub
		if(number == null || number.size() < 2) {
			return null;
		}
		
		Collections.sort(number,Collections.reverseOrder());
		return number.get(1);
	}

}
