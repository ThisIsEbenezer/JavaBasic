package com.basicjava;

public class ReverseNumber {
	public static void main(String[] args) {
		int originalNumber = 12345; 
        int reversedNumber = reverse(originalNumber);

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
		
	}

	private static int reverse(int number) {
		// TODO Auto-generated method stub
		int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10;
            System.out.println("Digit-"+digit);
            reversed = reversed * 10 + digit;
            System.out.println("reversed-"+reversed);
            number = number / 10;
            //number /= 10;
            System.out.println("number"+number);
        }
        return reversed;
	}

}
