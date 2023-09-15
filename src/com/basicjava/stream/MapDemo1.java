package com.basicjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	public static void main(String[] args) {
		
		List<String> vechiles = Arrays.asList("bus","car","train","flight","bicycle");
		
		List<String> upperCaseVechiles = vechiles.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		//List<String> upperCaseVechiles = vechiles.stream().filter(n->n.charAt(0) == 'b').map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperCaseVechiles);
	}

}
