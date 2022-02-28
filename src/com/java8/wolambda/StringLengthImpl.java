package com.java8.wolambda;

public class StringLengthImpl implements StringLength {

	@Override
	public int getLength(String name) {
		
		System.out.println("Name:"+name);
		int len = name.length();
		System.out.println("Length:"+len);
		
		return len;
	}

}
