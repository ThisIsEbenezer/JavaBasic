package com.basicjava.collection;

public class ThirdLargestNumber {
	public static void main(String[] args) {
		 int[] numbers = {10, 5, 20, 15, 30, 25}; // Replace with your array of integers
	        int thirdLargest = findThirdLargest(numbers);

	        System.out.println("Third Largest Number: " + thirdLargest);
	        
	}

	private static int findThirdLargest(int[] arr) {
		// TODO Auto-generated method stub
		int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        
        
        for (int i : arr) {
	    	 if( i > firstLargest ) {
	    		 thirdLargest = secondLargest;
	    		 secondLargest = firstLargest;
	    		 firstLargest = i;
	    	 } else if (i > secondLargest  && i != firstLargest) {
	    		 thirdLargest = secondLargest;
	    		 secondLargest = i;
	    	 } else if (i > thirdLargest  && i != secondLargest && i != firstLargest) {
	    		 thirdLargest = i;
	    	 } 
	    	 
	     }        
        
		return thirdLargest;
        
        
	}

}
