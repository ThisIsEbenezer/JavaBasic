package com.basicjava.pattern;

public class PrintPyramidTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pyramid pattern of star in Java : ");

		drawPyramidPattern(); 
		
		System.out.println("Pyramid of numbers in Java : "); 
		
		drawPyramidPattern(); 

		
	}

	private static void drawPyramidOfNumbers() {
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5 - i; j++) { 
				System.out.print(" "); 
			} 
	
			for (int k = 0; k <= i; k++) { 
				System.out.print("* "); 
			} 
		System.out.println(); 
	}
		
	}

	private static void drawPyramidPattern() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5 - i; j++) { 
				System.out.print(" "); 
			} 
	
			for (int k = 0; k <= i; k++) { 
				System.out.print(k +" "); 
			} 
		System.out.println(); 
		
	}

}
}
