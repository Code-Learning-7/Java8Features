package com.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductListWOStream {

	public static void main(String[] args) {
		
		List<Product> productlist = new ArrayList<>();
		
		productlist.add(new Product(1, "Toy", 200));
		productlist.add(new Product(2, "Book", 300));
		productlist.add(new Product(3, "Pen", 100));
		productlist.add(new Product(4, "Bat", 500));
		
		//Collections.sort(productlist, new com.java8.streams.MyCOmparator());
		
		//System.out.println("PriceList Less than 500 :"+productlist);
		
         List<Integer> pricelist = new ArrayList<>();
         
         for (Product product : productlist) {
        	 
			if(product.getPrice() < 500)
			{
				pricelist.add(product.getPrice());
			}
			Collections.sort(pricelist); // java.util.ConcurrentModificationException//Fail Fast 
		}
           System.out.println("PriceList Less than 500 :"+pricelist);
	}

}
