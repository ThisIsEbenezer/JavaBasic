package com.basicjava.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPrintLamba {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("1 Samuel");
		list.add("2 Ebenezer");

		list.forEach(System.out::print);
	}

}
