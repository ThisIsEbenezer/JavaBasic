package com.basicjava;

//F(n) = F(1)*F(2)...F(n-1)*F(n)
//How can you find the factorial of an integer in Java?
// (n * factorial(n - 1));
public class Factorial {
	
	public static void main(String[] args) {
		long n = 4;
		 System.out.println(factorial(n));
	}

	public static long factorial(long n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

}
