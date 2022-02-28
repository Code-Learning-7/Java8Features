package com.java8.funint.bifunc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ApplyBifn {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer ,Double> fn = (i,j) -> i+j+2.0;
		
		System.out.println(fn.apply(20,20));

	}

}
