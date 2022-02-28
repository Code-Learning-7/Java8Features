package com.java8.funin.bicon;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsume {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> c1 = (i,j) -> System.out.println(i+j+2); // it is consuming here and doing operations and printing
		
		// System.out.println(c1.accept(3,4)); // it does not return any value , so if we try to print anything .. so error
		c1.accept(3,4);
	}

}
