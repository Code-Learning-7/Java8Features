package com.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class MonthExapmle {

	public static void main(String[] args) {
		
		Month a =Month.valueOf("january".toUpperCase());
		System.out.println(a);

		LocalDate y=Year.now().atMonth(a).atDay(4);
		 System.out.println( y.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
		System.out.println(y);
		
		Month m1=y.getMonth();
		System.out.println(m1);
		
		while(a==m1)
		{
			System.out.println(y);
		System.out.println(y.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));			
		a=y.getMonth();
		System.out.println(a);
			break;
		}
		
		
	}

}
