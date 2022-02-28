package com.java8.wolambda2;

public class SquareImpl implements Square {

	@Override
	public int getSquare(int num) {
		
		int squ = num*num;
		
		System.out.println("Square:"+squ);
		
		return squ;
	}

}
