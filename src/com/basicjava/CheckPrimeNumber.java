package com.basicjava;

// Write a Java program to check if the given number is a prime number.

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int n = 29;
		System.out.println(isPrime(n));
		
		n = 49;
		System.out.println(isPrime(n));
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			System.out.println(i);
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
