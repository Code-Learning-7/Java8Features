package com.java8.functionalinterfac.function;

import java.util.function.Function;

public class FunctionAndThen { //function chainning

	public static void main(String[] args) {
		
		Function<String, Integer> fn = i -> i.length();
		Function<Integer, Integer> fn1 =i -> i*2;
		System.out.println(fn.apply("Sumantha"));
		System.out.println(fn.andThen(fn1).apply("aaa"));
		
		

	}

}
