package com.basicjava.practice;

public class CheckEvenNumberWihoutPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2101;
		checkEven(n);
	}

	private static void checkEven(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.println("Even");
		}
		else if (n ==1) {
			System.out.println("Old");
		}
		else {
			checkEven(n-2);
		}
	}

}
