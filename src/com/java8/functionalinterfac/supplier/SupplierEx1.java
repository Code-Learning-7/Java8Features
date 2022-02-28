package com.java8.functionalinterfac.supplier;

import java.util.function.Supplier;

public class SupplierEx1 {

	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "sumantha";
		
		System.out.println(supplier.get());

	}

}
