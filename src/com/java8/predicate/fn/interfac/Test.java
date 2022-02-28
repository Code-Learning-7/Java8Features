package com.java8.predicate.fn.interfac;

import java.util.function.Predicate;

public class Test implements Predicate<Integer> {

	@Override
	public boolean test(Integer a) {
		
		if (a>5)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}
