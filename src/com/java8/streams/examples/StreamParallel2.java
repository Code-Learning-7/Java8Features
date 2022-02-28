package com.java8.streams.examples;

import java.util.ArrayList;
import java.util.List;

public class StreamParallel2 {

	public static void main(String[] args) {
		
		System.out.println("Normal Flow");
		
		List<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
		
		str.stream().forEach(System.out :: println);
		System.out.println("Parallel Flow");
		str.parallelStream().forEach(System.out :: println);

	}

}
