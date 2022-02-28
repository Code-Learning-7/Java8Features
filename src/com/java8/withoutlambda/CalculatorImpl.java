package com.java8.withoutlambda;

public class CalculatorImpl implements Calculator {

	@Override
	public void add(int a, int b) {
		
		System.out.println("sum ="+ (a+b));

	}

}
