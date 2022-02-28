package com.java8.functionalinterfac.function;

import java.util.function.Function;

public class FunctionApply {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fn = i -> i*i;
		
		System.out.println(fn.apply(20));

	}

}
