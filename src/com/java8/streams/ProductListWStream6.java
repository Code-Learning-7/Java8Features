package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductListWStream6 {

	public static void main(String[] args) {
		
       List<Product> productList = new ArrayList<>();
		
        productList.add(new Product(1, "TOY", 200));
        productList.add(new Product(2, "BOOK", 300));
        productList.add(new Product(3, "PEN", 100));
        productList.add(new Product(4, "BAT", 500));
        productList.add(new Product(5, "BALL", 600));
        
        Optional<Product> product = productList.stream().min((p1,p2) -> p1.getPrice() >p2.getPrice()?1:-1);
        
       Product p1 = product.get();
       
       System.out.println(p1.getPrice());

	}

}
