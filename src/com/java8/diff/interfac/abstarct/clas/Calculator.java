package com.java8.diff.interfac.abstarct.clas;

public interface Calculator {
    
	int add(int a, int b);
	default int sub(int a, int b)
	{
		return a-b;
	}
	static int multiply(int a,int b)
	{
		return a*b;
	}
	
}
