package com.basicjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunctionsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vechiles = Arrays.asList("bus","car","train","car","flight","bicycle");
		
		
		List<String> vechiles1 = vechiles.stream().distinct().collect(Collectors.toList());
		System.out.println(vechiles1);
		
		long vechiles2 = vechiles.stream().distinct().count();
		System.out.println(vechiles2);
		
		
		List<String> vechiles3 = vechiles.stream().distinct().limit(2).collect(Collectors.toList());
		System.out.println(vechiles3);
	}

}
