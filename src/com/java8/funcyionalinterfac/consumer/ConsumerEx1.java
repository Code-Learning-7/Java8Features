package com.java8.funcyionalinterfac.consumer;

import java.util.function.Consumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		
		//Consumer<String> consume = str -> System.out.println(str.toUpperCase());
		
		Consumer<Integer> con1 = i -> System.out.println(i*2);
		
		con1.accept(2);

	}

}
