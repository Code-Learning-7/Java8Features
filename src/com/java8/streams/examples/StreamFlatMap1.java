package com.java8.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap1 {

	public static void main(String[] args) {
		
	List<String> list = new ArrayList<>();
	
	list.add("banana");
	list.add("mango");
	list.add("apple");
	
	List<String> list1 = new ArrayList<>();
	
	list.add("musk");
	list.add("pomege");
	
	List<List<String>> list3 = new ArrayList<>();
	
	list3.add(list);
	list3.add(list1);
	
	List<String> upper =list3.stream().flatMap(l -> l.stream()
									 .filter(i->i.length()>5)
									  .peek(System.out :: println)
									  .map(f -> f.toUpperCase()))
										.peek(System.out :: println)
									  .collect(Collectors.toList());
	
	System.out.println(upper);
	
	

	}

}
