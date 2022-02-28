package com.java8.funint.bifunc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestBifn2 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> fn1 = (i,j) -> i+j+20;
		
		Function<Integer, Integer> fn2 = i -> i-2;
		
		System.out.println(fn1.andThen(fn2).apply(10, 20));

	}

}
