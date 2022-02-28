package com.java8.wlambda2;

public class Test {

	public static void main(String[] args) {
		
       Square sq = num -> System.out.println("Square:"+num*num);
			
		sq.getSquare(5);

	}

}
