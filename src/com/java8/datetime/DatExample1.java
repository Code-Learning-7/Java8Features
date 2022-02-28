package com.java8.datetime;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatExample1 {

	public static void main(String[] args) {
		
		//Before java 8
		Date dt = new Date();
		System.out.println(dt);
		
		
		//Since java 8
		LocalDate d =LocalDate.now();
		System.out.println(d);
        
		LocalDate m =d.minusDays(3);
		System.out.println(m);
		
		LocalDate p =d.plusDays(4);
		System.out.println(p);
		
		LocalDate o =LocalDate.of(2000, 10, 10);// YYYY-MM-DD
		System.out.println(o.isLeapYear());
		
		Year y=Year.now();
		System.out.println(y.isLeap());
		
		LocalDate s = LocalDate.now();
		System.out.println(s.toString());
		String s1=s.format(DateTimeFormatter.ISO_DATE);
		System.out.println(s1);
		
		String s2 = "2021-10-10";
		LocalDate l=LocalDate.parse(s2);
		System.out.println(l);
	}

}
