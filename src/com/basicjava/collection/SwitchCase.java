package com.basicjava.collection;

public class SwitchCase {
	
	public static void main(String[] args) {
		int choice = 5;

		int x = switch (choice) {
		    case 1, 2, 3:
			    yield choice;
		    default:
			    yield -1;
		};

		System.out.println("x = " + x); // x = 2
	}

}
