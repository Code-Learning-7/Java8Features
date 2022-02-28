package com.java8.collections.setwolambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>(new MyComparator());
		
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(2);
		set.add(1);
		
		System.out.println("Sorting :"+set);
		
		
		

	}

}
