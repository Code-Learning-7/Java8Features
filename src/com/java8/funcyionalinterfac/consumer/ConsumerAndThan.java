package com.java8.funcyionalinterfac.consumer;

import java.util.function.Consumer;

public class ConsumerAndThan {

	public static void main(String[] args) {
		
		Consumer<String> consume1 = str -> System.out.println(str.length());
		
		Consumer<String> consume2 = struc -> System.out.println(struc.toLowerCase());
		
		consume1.andThen(consume2).accept("sumantha");
	}

}
