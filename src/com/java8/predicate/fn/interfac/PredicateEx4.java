package com.java8.predicate.fn.interfac;

import java.util.function.Predicate;

public class PredicateEx4 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> a>10;
		
		System.out.println(p.negate().test(3)); // reverse of output
		

	}

}
