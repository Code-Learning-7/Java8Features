package com.java8.defaultmethods;

public interface Test {
	
	public abstract int square(int a);
	
	 default void show() //default method
	{
		System.out.println("This is a default method");
	}

}


