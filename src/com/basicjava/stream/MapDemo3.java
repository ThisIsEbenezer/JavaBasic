package com.basicjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(2,3,4,5);
		
		//
		
		List<Integer> muitpliedList  = 	numList.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(muitpliedList);
		
	}

}
