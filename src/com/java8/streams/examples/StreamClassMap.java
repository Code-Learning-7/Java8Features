package com.java8.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassMap {
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("MuskMelon");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Banana");
		list2.add("WaterMelon");
		
		List<List<String>> list3 = new ArrayList<>();
		list3.add(list);
		list3.add(list2);
		
		System.out.println(list3);
		
		
		List<Integer> length =list3.stream().flatMap(l -> l.stream().map(f ->f.length()).peek(System.out :: println)).collect(Collectors.toList());
		System.out.println("List of length of fruits:"+length);		
	}

}
