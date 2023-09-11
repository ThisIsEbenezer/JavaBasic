package com.basicjava.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveArrayListDuplicate {
	
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>(); 
		primes.add(2); 
		primes.add(3); 
		primes.add(5); 
		primes.add(7);  
		primes.add(7); 
		primes.add(11);
		
		System.out.println("Before Removing Duplicates");
		for (Object obj : primes) {
			System.out.println(obj);
		}		
		
		Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
		
		System.out.println("After Removing Duplicates");
		for (Object obj : primesWithoutDuplicates) {
			System.out.println(obj);
		}
		
	}

}
