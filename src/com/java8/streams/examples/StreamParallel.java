package com.java8.streams.examples;

import java.util.List;
import java.util.stream.IntStream;

public class StreamParallel {

	public static void main(String[] args) {
		
		System.out.println("Normal Stream Flow");
		
		IntStream a =IntStream.rangeClosed(1, 10);
		
		a.forEach(System.out :: println);
        
		System.out.println(" In Parallel Stream Flow");
		
		IntStream b = IntStream.rangeClosed(1, 10);
		
		b.parallel().forEach(System.out :: println);
	}

}
