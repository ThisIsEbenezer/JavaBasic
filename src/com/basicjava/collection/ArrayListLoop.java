package com.basicjava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("1 Samuel");
		list.add("2 Ebenezer");
		list.add("3 Benisha");
		
		System.out.println("While Loop:");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next());
		}
		
		System.out.println("For Loop:");
		 for(int i=0; i < list.size(); i++) {
			 System.out.println(list.get(i));
		 }
		 
		System.out.println("Adavanded For Loop:");
		for (Object list1 : list) {
			 System.out.println(list1);
		}
		

	}

}
