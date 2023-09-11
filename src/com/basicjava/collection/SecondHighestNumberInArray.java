package com.basicjava.collection;

//for (int i : arr) {
//if( i > largest ) {
//	 largest = secondLargest;
//	 largest = i;


public class SecondHighestNumberInArray {
	
	public static void main(String[] args) {
		 int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
	     int largest = Integer.MIN_VALUE;
	     int secondLargest = Integer.MIN_VALUE;
	     
	     for (int i : arr) {
	    	 if( i > largest ) {
	    		 largest = secondLargest;
	    		 largest = i;
	    	 } else if (i > secondLargest) {
	    		 secondLargest = i;
	    	 }
	    	 
	     }
	     System.out.println("Second largest number is:" + secondLargest);
	     System.out.println("Largest Number is: "  +largest);
	     
	}

}
