package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductListWStream8 {

	public static void main(String[] args) {
		
       List<Product> productList = new ArrayList<>();
		
        productList.add(new Product(1, "TOY", 200));
        productList.add(new Product(2, "BOOK", 300));
        productList.add(new Product(3, "PEN", 100));
        productList.add(new Product(4, "BAT", 500));
        productList.add(new Product(5, "BALL", 500));
        productList.add(new Product(6, "DOLL", 600));
        
       long count = productList.stream().count();
        
        //long count = productList.stream().collect(Collectors.counting());
       
       System.out.println(count);

	}

}
