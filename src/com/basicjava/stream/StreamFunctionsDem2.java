package com.basicjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFunctionsDem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(-9,1,2,1,3,2,4,5,6,7,8,9,10);	
		long even = list1.stream().filter(x->x%2==0).count();
		System.out.println(even);
		
		Optional<Integer> min = list1.stream().min((n1,n2)-> { 
			return n1.compareTo(n2);
		});
		System.out.println(min.get());
		
		Optional<Integer> max = list1.stream().max((n1,n2)-> { 
			return n1.compareTo(n2);
		});
		System.out.println(max.get());
		
		
		List<String> stringList = Arrays.asList("A","B","C","1","D","2","3","4");
		
		Optional<String> reduced=  stringList.stream().reduce((value,combiedValue) -> {
			//return combiedValue+value;
			return value+combiedValue;
		});		
		System.out.println(reduced.get());
		
		Object arr[] = stringList.stream().toArray();
		System.out.println("arr length ="+arr.length);
		
		
		
	}

}
