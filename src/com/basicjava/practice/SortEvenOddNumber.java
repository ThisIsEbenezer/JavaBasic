package com.basicjava.practice;

public class SortEvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,6,8,17,11,20};
		arrayEvenOdd(arr);
	}
	
	public static void arrayEvenOdd(int arr[]) {
		int[] a = new int[arr.length];
		
		int index =0;
		for(int i = 0;i < a.length;i++) {
			if(arr[i] %2 == 0) {
				a[index] = arr[i];
				index++;
			}
		}
		
		for(int j = 0;j < a.length;j++) {
			if(arr[j] %2 != 0) {
				a[index] = arr[j];
				index++;
			}
		}
		
		for(int i = 0;i < a.length;i++) {
		System.out.println(a[i]);
		}
		
	}

}
