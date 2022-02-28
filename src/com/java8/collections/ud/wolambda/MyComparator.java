package com.java8.collections.ud.wolambda;

import java.util.Comparator;

public class MyComparator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		
		return o1.getOrderName().compareTo(o2.getOrderName());

}
}
