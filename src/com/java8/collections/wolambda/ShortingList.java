package com.java8.collections.wolambda;

import java.util.ArrayList;
import java.util.Collections;

public class ShortingList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println("List before Sort:"+list);
	//Collections.sort(list);
		Collections.sort(list,new MyComparator());
	System.out.println("List after Sort:"+list);
	
	}

}
