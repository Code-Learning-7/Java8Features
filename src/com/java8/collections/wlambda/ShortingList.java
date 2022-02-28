package com.java8.collections.wlambda;

import java.util.ArrayList;
import java.util.Collections;

public class ShortingList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(4); // duplication allowed in list
		
		System.out.println("Before Sorting :"+list);
		Collections.sort(list , (i1,i2) -> {
			return (i1<i2) ? 1 : (i1>i2) ? -1 : 0;
					});// Ascending Order by Default
		System.out.println("After Starting :"+list);

	}

}
