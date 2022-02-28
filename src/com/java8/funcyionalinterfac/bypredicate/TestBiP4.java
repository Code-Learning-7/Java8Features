package com.java8.funcyionalinterfac.bypredicate;

import java.util.function.BiPredicate;

public class TestBiP4 {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bp1 = (i,j) -> i>j;
		System.out.println(bp1.negate().test(23, 21));

	}

}
