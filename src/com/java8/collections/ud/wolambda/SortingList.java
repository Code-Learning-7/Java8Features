package com.java8.collections.ud.wolambda;

import java.util.ArrayList;
import java.util.Collections;

import com.java8.collections.wolambda.MyComparator;

public class SortingList {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.setOrderId(1);
		order.setOrderName("Dress");
		order.setOrderValue(500);
		
		Order order2 = new Order(4, "Jeans", 600);
		Order order3 = new Order(2, "Shirt", 800);
		Order order4 = new Order(3, "Saree", 200);
		
		ArrayList<Order> list = new ArrayList<>();
		
		list.add(order);
		list.add(order2);
		list.add(order3);
		list.add(order4);
		
		System.out.println("Order Details:"+list);
		
		Collections.sort(list, new com.java8.collections.ud.wolambda.MyComparator());
		
		System.out.println("Order Details Sort:"+list);

	}

}
