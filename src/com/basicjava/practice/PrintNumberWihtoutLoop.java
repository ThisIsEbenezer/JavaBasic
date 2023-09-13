package com.basicjava.practice;

public class PrintNumberWihtoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(1);
	}
	
	public static void printNumber(int n) {
		if(n <=100) {
			System.out.println(n);
			printNumber(n+1);
		}
		
		
	}

}
