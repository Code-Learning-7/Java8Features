package com.java8.methodreference;

public interface TestInterface {

	//private void m1(); // private not allowed in an interface
	
	public void m2();
	
	static void m3()
	{
		
	}
	
	default void m4()
	{
		
	}
	
	//protected void m5();// protected not allowed in an interface
}
