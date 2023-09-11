package com.basicjava;

//Write a Java program to print a Fibonacci sequence using recursion.
public class PrintFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		printFibonacci(15);		

	}

	private static void printFibonacci(int count) {
		// TODO Auto-generated method stub		
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + " ");
	        a = b;
	        b = c;
			c = a + b;
		}
		
	}

}
