package com.java8.streams.examples;

import java.util.stream.IntStream;

public class StreamParallel3 {

	public static void main(String[] args) {
		
		System.out.println("Normal Flow");
		
         IntStream a =IntStream.rangeClosed(1, 10);
		 System.out.println(a.isParallel());
		 //a.forEach(System.out :: println);
		 
		 a.forEach(x -> System.out.println("Thread"+Thread.currentThread().getName()+",Value"+x));
		 
		 System.out.println("Parallel Flow");
		 
		 IntStream b=IntStream.rangeClosed(1, 10);
		 System.out.println(b.isParallel());
		 b.parallel();
		 b.forEach(x -> System.out.println("Thread"+Thread.currentThread().getName()+",Value"+x));
		 System.out.println(b.isParallel());
		 
		 
		 
		 

	}

}
