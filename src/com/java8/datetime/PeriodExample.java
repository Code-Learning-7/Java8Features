package com.java8.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		
		System.out.println(Period.between(LocalDate.now(),LocalDate.of(2021, 12, 20)));

	}

}
