package com.java8.funcyionalinterfac.bypredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestBiPred {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> p = (i,j) -> i>j;
		
		System.out.println(p.test(20,30));

	}

}
