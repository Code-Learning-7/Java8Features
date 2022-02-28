package com.java8.predicate.fn.interfac;

import java.util.function.Predicate;

public class PredicateEx3 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> a>20;
		Predicate<Integer> p1 = a -> a<25;
		
		boolean rst = p.or(p1).test(26);
		
		System.out.println(rst);

	}

}
