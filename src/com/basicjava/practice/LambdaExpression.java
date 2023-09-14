package com.basicjava.practice;

import java.util.function.Predicate;

public class LambdaExpression {
	public static void main(String[] args) {
		
		String names[] = {"Sam","Samuel","Ebenezer","Ebe","Hey","Hello"};
		String result[]; 
		Predicate<String> pr = x -> x.length() > 4;
		for (String name : names) {
			if(pr.test(name)) {
				System.out.println(name);
			}
		}
		
	}

}
