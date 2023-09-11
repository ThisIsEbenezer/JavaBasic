package com.basicjava;

//How do you swap two numbers without using a third variable in Java?

//b = b + a; // now b is sum of both the numbers
//a = b - a; // b - a = (b + a) - a = b (a is swapped)
//b = b - a; // (b + a) - b = a (b is swapped)
public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("a is " + a + " and b is " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping, a is " + a + " and b is " + b);
	}

}
