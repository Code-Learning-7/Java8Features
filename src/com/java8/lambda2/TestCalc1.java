package com.java8.lambda2;

public class TestCalc1 {

	public static void main(String[] args) {
		
      Calculator1 cal = (a,b) -> {
			
			System.out.println("sum ="+ (a+b));

		};
		
		cal.add(2, 3);

	}

}

// access modifier , return type , method name and parameter type(data type) not required , directly it will start with paranthesis.