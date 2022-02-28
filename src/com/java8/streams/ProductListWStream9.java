package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductListWStream9 {

	public static void main(String[] args) {
		
        List<Product> productList = new ArrayList<>();
		
        productList.add(new Product(1, "TOY", 200));
        productList.add(new Product(2, "BOOK", 300));
        productList.add(new Product(3, "PEN", 100));
        productList.add(new Product(4, "BAT", 500));
        productList.add(new Product(5, "BALL", 500));
        
      List<Product> pList = productList.stream().filter(p -> p.getPrice() <400).collect(Collectors.toList());
      
      System.out.println(pList);
      
     //pList.forEach(p -> System.out.println(pList));

	}

}
