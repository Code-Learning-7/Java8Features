package com.java8.predicate.fn.interfac;

import java.util.function.Predicate;

public class TestPrediacte {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a -> a>5;
		
		System.out.println(p.test(10));

	}

}
