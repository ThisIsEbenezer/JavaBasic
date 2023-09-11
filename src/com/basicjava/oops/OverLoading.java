package com.basicjava.oops;

public class OverLoading {
	public static void main(String[] args) {
		
		 

	        int sum1 = add(5, 10);
	        double sum2 = add(3.5, 2.5);

	        System.out.println("Sum of integers: " + sum1);
	        System.out.println("Sum of doubles: " + sum2);
		
	
	   
	    
	}

	 // Overloaded method to add two integers
    private static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    private static double add(double a, double b) {
        return a + b;
    }
    

}