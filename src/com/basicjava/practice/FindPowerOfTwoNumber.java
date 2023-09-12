package com.basicjava.practice;

import java.util.Scanner;

public class FindPowerOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		//int power = 3;
		
		Scanner inputScanner = new Scanner(System.in);
		int power = inputScanner.nextInt();
		
		
		int result =1;
		
		for (int i = power ;i !=0; i--) {
			result = result * base;
		}
		
		System.out.println("Result =  " + result);
	}

}
