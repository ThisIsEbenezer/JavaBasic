package com.basicjava;

//sum +=i;
//How do you get the sum of all elements in an integer array in Java?

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2,5 };

		int sum = 0;
		
		for (int i : array) {
			sum +=i;
		}	
		
		System.out.println(sum);

	}

}
