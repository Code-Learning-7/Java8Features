package com.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIdExample {

	public static void main(String[] args) {
		
		ZoneId id=ZoneId.of("Asia/Kolkata");
		ZoneId id1=ZoneId.of("Asia/Tokyo");
		
		LocalTime lid=LocalTime.now(id);
		LocalTime lid2=LocalTime.now(id1);
		
		System.out.println(lid);
		System.out.println(lid2);
		
       System.out.println(LocalDate.of(2012, 12, 21).getDayOfWeek());

	}

}
