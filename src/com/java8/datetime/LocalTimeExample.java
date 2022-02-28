package com.java8.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		System.out.println(LocalDateTime.now());
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		LocalTime t1=t.minusHours(4);
		System.out.println(t1);
	

	}

}
