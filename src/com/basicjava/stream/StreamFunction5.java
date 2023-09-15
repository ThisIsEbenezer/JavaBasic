package com.basicjava.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamFunction5 {
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("one","two","three","one");
		Optional<String>  findAny = stringList.stream().findAny();
		System.out.println(findAny.get());
		
		List<String> stringList1 = Arrays.asList("one","two","three","one");
		Optional<String>  findFirst = stringList1.stream().findFirst();
		System.out.println(findFirst.get());
		
		List<String> stringList2 = Arrays.asList("one","two","three","four");
		List<String> stringList3 = Arrays.asList("A","C","D","1");
		
		Stream<String> stream1 = stringList2.stream();
		Stream<String> stream2 = stringList3.stream();
		
		
		List<String> finalResult1 = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(finalResult1);
	}

}
