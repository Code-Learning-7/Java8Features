package com.ava8.collections.mapwolambda;

import java.util.Comparator;

public class MyComparator2 implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
		
		
	}

}
