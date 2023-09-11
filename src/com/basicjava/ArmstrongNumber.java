package com.basicjava;

//while (number != 0)
//{
//    temp = number % 10;
//    number = number/10;
//    total = total + temp*temp*temp;
//}
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num = 153, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            number = number/10;
            total = total + temp*temp*temp;
        }
        
        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
	

}
