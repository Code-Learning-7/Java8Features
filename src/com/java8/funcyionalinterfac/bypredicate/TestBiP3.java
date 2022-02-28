package com.java8.funcyionalinterfac.bypredicate;

import java.util.function.BiPredicate;

public class TestBiP3 {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bp1 = (i,j) -> i>j;
		
		BiPredicate<Integer, Integer> bp2 = (i,j) -> i-2>j;
		
		System.out.println(bp1.or(bp2).test(20, 19));

	}

}
