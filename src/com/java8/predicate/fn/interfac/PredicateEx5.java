package com.java8.predicate.fn.interfac;

import java.util.function.Predicate;

public class PredicateEx5 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = Predicate.isEqual(4); // static method
		
		System.out.println(p.test(4));
		
		

	}

}
