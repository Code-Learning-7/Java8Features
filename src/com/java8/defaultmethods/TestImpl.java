package com.java8.defaultmethods;

public class TestImpl implements Test1, Test2 {
    
	public void show()
	{
		Test1.super.show();
		//Test2.super.show();
	}
	
	public static void main(String[] args)
	{
		TestImpl test = new TestImpl();
		test.show();		
	}
}
