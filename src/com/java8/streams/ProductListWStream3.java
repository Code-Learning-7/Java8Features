package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductListWStream3 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		
        productList.add(new Product(1, "TOY", 200));
        productList.add(new Product(2, "BOOK", 300));
        productList.add(new Product(3, "PEN", 100));
        productList.add(new Product(4, "BAT", 500));
        productList.add(new Product(5, "BALL", 500));
        
        //Map<Integer, String> nameList = productList.stream().collect(Collectors.toMap(p ->p.getId(), p ->p.getName()));
        //list to map
        //Map<Integer, String> nameList = productList.stream().collect(Collectors.toMap(Product::getId , Product::getName));
        
        Map<Integer, String> nameList = productList.stream().peek(System.out :: println).collect(Collectors.toMap(Product::getId , Product::getName));
    
        System.out.println(nameList);
	

	}
}

		