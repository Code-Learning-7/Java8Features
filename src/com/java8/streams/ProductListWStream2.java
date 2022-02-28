package com.java8.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductListWStream2 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
				
		         productList.add(new Product(1, "TOY", 200));
		         productList.add(new Product(2, "BOOK", 300));
		         productList.add(new Product(3, "PEN", 100));
		         productList.add(new Product(4, "BAT", 500));
		         productList.add(new Product(5, "BALL", 500));
		         
		  //Set<Integer> priceList = new HashSet();
		  
		 /* for (Product product : productList) {
			  
			  if(product.getPrice() == 500)
			  {
				priceList.add(product.getPrice());  
			  }
			
		}*/
		  
		  Set<Integer> priceList =  productList.stream().filter(product -> product.getPrice() == 500).map(product -> product.getPrice()).collect(Collectors.toSet());
		  
		System.out.println("The PriceList equal to 500:"+priceList);  
		  

	}

}
