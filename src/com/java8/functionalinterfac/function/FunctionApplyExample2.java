package com.java8.functionalinterfac.function;

import java.util.function.Function;

public class FunctionApplyExample2 {

	public static void main(String[] args) {
		
		Function<Employee, String> fn1 = emp -> emp.getEmpName();
		
		System.out.println(fn1.apply(new Employee(2, "sumantha", 23)));
		
		Function<String, Integer> fn2 = name -> name.length();
		
		System.out.println(fn2.apply("sumantha"));
		
		Function<Integer, Integer> fn3 = number -> number*number;
		
		Integer square = fn1.andThen(fn2).andThen(fn3).apply(new Employee(2, "sumantha", 23)); //functionchaining
		
		System.out.println("EmployeeNameLengthSquare:"+square);
	}

}
