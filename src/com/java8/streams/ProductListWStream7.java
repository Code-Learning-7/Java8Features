package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductListWStream7 {

	public static void main(String[] args) {
		

	 List<Product> productList = new ArrayList<>();
		
     productList.add(new Product(1, "TOY", 200));
     productList.add(new Product(2, "BOOK", 300));
     productList.add(new Product(3, "PEN", 100));
     productList.add(new Product(4, "BAT", 500));
     productList.add(new Product(5, "BALL", 600));
     
     Double avgPrice = productList.stream().collect(Collectors.averagingDouble(product -> product.getPrice()));
     //int avgPrice = productList.stream().collect(Collectors.averagingLong(p ->p.getPrice()));
     
     System.out.println(avgPrice);
     
}
}
