package com.basicjava.oopsdemo;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		
		double area = circle.calculateArea();
		System.out.println("Area of circle is"+ area);
		
	}

}
