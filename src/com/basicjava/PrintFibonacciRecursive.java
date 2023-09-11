package com.basicjava;

//F(N) = F(N-1) + F(N-2)
//Write a Java program to print a Fibonacci sequence using recursion.
public class PrintFibonacciRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seqLength = 15;
		System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
		for (int i = 0; i < seqLength; i++) {
      	    System.out.print(fibonacci(i) + " ");
    	}

	}
	private static int fibonacci(int count) {
		// TODO Auto-generated method stub		
		if (count <= 1) {
			return count;
		}	
		int num = fibonacci(count - 1) + fibonacci(count - 2);
		
		return num;
	}

}
