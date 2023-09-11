package com.basicjava;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("4");
		List<String> list2 = new ArrayList<>();
		list2.add("2");
		list2.add("3");

		List<String> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		System.out.println(mergedList); 
	}

}
