package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductListWStream {

	public static void main(String[] args) {
		
		List<Product> productlist = new ArrayList<>();
		
		productlist.add(new Product(1, "Toy", 200));
		productlist.add(new Product(2, "Book", 300));
		productlist.add(new Product(3, "Pen", 100));
		productlist.add(new Product(4, "Bat", 500));
        
		//List<Integer> pricelist = new ArrayList<>();
		
		/*for (Product product : productlist) {
			
			if(product.getPrice() < 500) 
			{
				pricelist.add(product.getPrice());
			}
		}*/
		//stream like iterator
		List<Product> pricelist = productlist.stream().filter(product -> product.getPrice() < 500).collect(Collectors.toList());
		
		 System.out.println("PriceList below 500:"+pricelist);
	}

}
