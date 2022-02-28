package com.java8.lamda1;

public class Test {

	public static void main(String[] args) {
		
		Interface1 i1 = () -> {	
			System.out.println("Lambda Implementation");

		};
		
		i1.m2();

	}

}
