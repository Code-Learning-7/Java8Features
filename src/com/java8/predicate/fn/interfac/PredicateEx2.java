package com.java8.predicate.fn.interfac;

import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> a>10;
		Predicate<Integer> p1 = a -> a<20;
		
		//p.test(6);
		boolean rst = p.and(p1).test(6); // predicate chaining
		
		System.out.println(rst);

	}

}
