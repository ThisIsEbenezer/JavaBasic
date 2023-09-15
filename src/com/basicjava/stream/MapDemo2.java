package com.basicjava.stream;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		List<String> vechiles = Arrays.asList("bus","car","train","flight","bicycle");
		
		vechiles.stream().map(vName -> vName.length()).forEach(len->System.out.println(len));
		
	}

}
