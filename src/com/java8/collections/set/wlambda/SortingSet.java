package com.java8.collections.set.wlambda;

import java.util.TreeSet;

public class SortingSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>(
				(arg0 , arg1) -> {return (arg0>arg1)? -1: (arg0<arg1) ? 1 : 0; });
		
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(1);
		
		System.out.println("Sorting :"+ set);

	}

}
