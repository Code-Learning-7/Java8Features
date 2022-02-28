package com.java8.others.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Set<Integer> s=list.stream().collect(Collectors.toSet());//terminary methods
		Stream<Integer> s1=list.stream();//Intermediate methods - which methods returns stream
		Stream<Integer> l=s1.filter(i -> i<3);//intermediate
		List<Integer> i=l.collect(Collectors.toList());//terminary
		System.out.println(i);
		

	}

}
