package com.basicjava;

//How do you find the second largest number in an array in Java?

public class SecondLargeNumberArray {
	
	public static void main(String[] args) {
		int[] array = { 10,1, 2,5,3,4,7 };
		
		 int highest  = Integer.MIN_VALUE;
	     int secondHighest  = Integer.MIN_VALUE;
	     
	     for (int i : array) {
	 		if (i > highest) {
	 			secondHighest = highest;
	 			highest = i;
	 		} else if (i > secondHighest) {
	 			secondHighest = i;
	 		}

	 	}

	     System.out.println(secondHighest);
	     System.out.println(highest);
	}

}
